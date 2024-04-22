package com.example.estate_grpc.service;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import io.grpc.Status;
import io.grpc.reflection.v1alpha.ErrorResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import net.devh.boot.grpc.server.service.GrpcService;

import com.example.estate_grpc.dto.EstateDTO;
import com.example.estate_grpc.dto.EstateUpdateDTO;
import com.example.estate_grpc.entity.Estate;
import com.example.estate_grpc.proto.EstateAllRequest;
import com.example.estate_grpc.proto.EstateAllResponse;
import com.example.estate_grpc.proto.EstateDeleteRequest;
import com.example.estate_grpc.proto.EstateDeleteResponse;
import com.example.estate_grpc.proto.EstateIdRequest;
import com.example.estate_grpc.proto.EstateInfoResponse;
import com.example.estate_grpc.proto.EstatePro;
import com.example.estate_grpc.proto.EstateProto;
import com.example.estate_grpc.proto.EstateProtoServiceGrpc;
import com.example.estate_grpc.proto.EstateSaveRequest;
import com.example.estate_grpc.proto.EstateSaveResponse;
import com.example.estate_grpc.proto.EstateUpdateRequest;
import com.example.estate_grpc.proto.EstateUpdateResponse;
import com.example.estate_grpc.repository.EstateRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

import io.grpc.stub.StreamObserver;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@GrpcService
public class GrpcServerService extends EstateProtoServiceGrpc.EstateProtoServiceImplBase {

    private final EstateRepository estateRepository;

    @Autowired
    private JPAQueryFactory queryFactory;

    @Autowired
    public GrpcServerService(EstateRepository estateRepository){
        this.estateRepository = estateRepository;
    }

    @Autowired
    private ModelMapper mapper;

    //estateDTO를 Estate로 변환
    private EstatePro buildEstateFromDTO(EstateDTO estateDTO){
        return EstatePro.newBuilder()
                .setEstateId(estateDTO.getId())
                .setLocation(estateDTO.getLocation())
                .setEstateType(estateDTO.getEstateType())
                .setDirection(estateDTO.getDirection())
                .setTotalFloor(estateDTO.getTotalFloor())
                .setBuildingFloor(estateDTO.getBuildingFloor())
                .setRoom(estateDTO.getRoom())
                .setToilet(estateDTO.getToilet())
                .setHashtag(estateDTO.getHashtag())
                .setM2(estateDTO.getM2())
                .build();
    }


    //estateid로 estate 조회
    public void findEstateInfo(EstateIdRequest request, StreamObserver<EstateInfoResponse> responseObserver){
        String estateId = request.getEstateId();

        //제공된 id로 estate 정보를 찾는 로직
        Optional<Estate> estateEntity = estateRepository.findById(estateId);

        EstateDTO estateDTO = mapper.map(estateEntity.get(), EstateDTO.class);
        log.info("get estate dto {}", estateDTO.toString());
        log.info("get estate entity {}", estateEntity.toString());

        EstateInfoResponse response = EstateInfoResponse.newBuilder()
                .setLocation(estateDTO.getLocation())
                .setEstateType(estateDTO.getEstateType())
                .setDirection(estateDTO.getDirection())
                .setTotalFloor(estateDTO.getTotalFloor())
                .setBuildingFloor(estateDTO.getBuildingFloor())
                .setRoom(estateDTO.getRoom())
                .setToilet(estateDTO.getToilet())
                .setHashtag(estateDTO.getHashtag())
                .setM2(estateDTO.getM2())
                .setEstateId(estateId) // 클라이언트로부터 받은 부동산 ID를 그대로 응답에 포함
                .build();

        //클라이언트로 응답을 전송
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //모든 estate 조회
    public void getEstateAll(EstateAllRequest estateAllRequest, StreamObserver<EstateAllResponse> responseStreamObserver){
        List<Estate> estateEntitys = estateRepository.findAll();
        List<EstateDTO> estateDTOS = Arrays.asList(mapper.map(estateEntitys, EstateDTO[].class));

        EstateAllResponse.Builder response = EstateAllResponse.newBuilder();

        for(EstateDTO estateDTO : estateDTOS){
            EstatePro estatePro = buildEstateFromDTO(estateDTO);
            response.addEstates(estatePro);
        }

        //응답
        responseStreamObserver.onNext(response.build());
        responseStreamObserver.onCompleted();
    }

    //SaveEstate
    @Override
    @Transactional
    public void saveEstate(EstateSaveRequest request, StreamObserver<EstateSaveResponse> responseStreamObserver){
        EstateDTO estateDTO = new EstateDTO();

//        String bulidingAddress = "서울시 동작구 노량진동";
//        String detailAddress = "c동 3층";
        //프런트단에서 md5 해싱한 걸 보낼거임. 여기서는 받아서 바로 조회.
//        estateRepository.findById(changeToMD5(bulidingAddress + detailAddress))
//                .ifPresent(foundEstate -> {
//                    throw new RuntimeException(changeToMD5(bulidingAddress + detailAddress) + " 이런 id는 이미 존재합니다.");
//                });

        estateRepository.findById(request.getEstateId())
                .ifPresent(foundEstate -> {
                    throw new RuntimeException(request.getEstateId() + " 이런 id는 이미 존재합니다.");
                });

        estateDTO.setId(request.getEstateId());
        estateDTO.setLocation(request.getLocation());
        estateDTO.setEstateType(request.getEstateType());
        estateDTO.setDirection(request.getDirection());
        estateDTO.setTotalFloor(request.getTotalFloor());
        estateDTO.setBuildingFloor(request.getBuildingFloor());
        estateDTO.setRoom(request.getRoom());
        estateDTO.setToilet(request.getToilet());
        estateDTO.setHashtag(request.getHashtag());
        estateDTO.setM2(request.getM2());

        Estate estateEntity = mapper.map(estateDTO, Estate.class);

        log.info("estate insert dto {}", estateDTO.toString());
        log.info("zip entity {}", estateEntity.toString());

        estateEntity = estateRepository.save(estateEntity);

        EstateSaveResponse response = EstateSaveResponse.newBuilder()
                .setEstateId(estateDTO.getId())
                .setLocation(estateDTO.getLocation())
                .setEstateType(estateDTO.getEstateType())
                .setDirection(estateDTO.getDirection())
                .setTotalFloor(estateDTO.getTotalFloor())
                .setBuildingFloor(estateDTO.getBuildingFloor())
                .setRoom(estateDTO.getRoom())
                .setToilet(estateDTO.getToilet())
                .setHashtag(estateDTO.getHashtag())
                .setM2(estateDTO.getM2())
                .build();

        //응답
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    //md5 해싱 하는 메소드
    public String changeToMD5(String str){
        String  MD5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<byteData.length; i++){
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            MD5 = sb.toString();

        }catch (Exception e){
            e.printStackTrace();
            MD5 = null;
        }
        return MD5;
    }

    //집 정보 update
    @Transactional
    public void updateEstate(EstateUpdateRequest request, StreamObserver<EstateUpdateResponse> responseStreamObserver){
        EstateUpdateDTO estateUpdateDTO = new EstateUpdateDTO();

        estateUpdateDTO.setId(request.getEstateId());
        estateUpdateDTO.setLocation(request.getLocation());
        estateUpdateDTO.setEstateType(request.getEstateType());
        estateUpdateDTO.setDirection(request.getDirection());
        estateUpdateDTO.setTotalFloor(request.getTotalFloor());
        estateUpdateDTO.setBuildingFloor(request.getBuildingFloor());
        estateUpdateDTO.setRoom(request.getRoom());
        estateUpdateDTO.setToilet(request.getToilet());
        estateUpdateDTO.setHashtag(request.getHashtag());
        estateUpdateDTO.setM2(request.getM2());

        Estate estate = estateRepository.findById(estateUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException(estateUpdateDTO.getId() + " 이러한 id의 estate는 없습니다."));

        //만약 DTO와 엔티티가 다르다면 업데이트를 수행
        if(!isSame(estate, estateUpdateDTO)){
            estate.setLocation(estateUpdateDTO.getLocation());
            estate.setEstateType(estateUpdateDTO.getEstateType());
            estate.setDirection(estateUpdateDTO.getDirection());
            estate.setTotalFloor(estateUpdateDTO.getTotalFloor());
            estate.setBuildingFloor(estateUpdateDTO.getBuildingFloor());
            estate.setRoom(estateUpdateDTO.getRoom());
            estate.setToilet(estateUpdateDTO.getToilet());
            estate.setHashtag(estateUpdateDTO.getHashtag());
            estate.setM2(estateUpdateDTO.getM2());
        }

        EstateUpdateResponse response = EstateUpdateResponse.newBuilder()
                .setEstateId(estate.getId())
                .setLocation(estate.getLocation())
                .setEstateType(estate.getEstateType())
                .setDirection(estate.getDirection())
                .setTotalFloor(estate.getTotalFloor())
                .setBuildingFloor(estate.getBuildingFloor())
                .setRoom(estate.getRoom())
                .setToilet(estate.getToilet())
                .setHashtag(estate.getHashtag())
                .setM2(estate.getM2())
                .build();

        //응답
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    //estate와 estateUpdateDTO가 같은지 비교
    public boolean isSame(Estate estate, EstateUpdateDTO estateUpdateDTO){
        return estate.getLocation().equals(estateUpdateDTO.getLocation())
                && estate.getEstateType().equals(estateUpdateDTO.getEstateType())
                && estate.getDirection().equals(estateUpdateDTO.getDirection())
                && estate.getTotalFloor() == estateUpdateDTO.getTotalFloor()
                && estate.getBuildingFloor() == estateUpdateDTO.getBuildingFloor()
                && estate.getRoom() == estateUpdateDTO.getRoom()
                && estate.getToilet() == estateUpdateDTO.getToilet()
                && estate.getHashtag() == estateUpdateDTO.getHashtag()
                && estate.getM2() == estateUpdateDTO.getM2();
    }

    //estate 삭제
    @Transactional
    public void deleteEstate(EstateDeleteRequest request, StreamObserver<EstateDeleteResponse> responseStreamObserver){
        String id = request.getEstateId();
        boolean isSuccess = false;

        try{
            //삭제 전에 해당 ID의 estate가 존재하는지 확인
            Optional<Estate> estateOptional = estateRepository.findById(id);
            if(estateOptional.isPresent()){
                estateRepository.deleteById(id);
                isSuccess = true;
            }else{
                throw new EntityNotFoundException(id + " 이러한 id의 zip이 없습니다.");
            }
        }catch (Exception e){
            isSuccess = false;
        }

        //결과에 따라 response에 true 또는 false를 담아 반환
        EstateDeleteResponse response = EstateDeleteResponse.newBuilder()
                .setSuccess(isSuccess)
                .build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }
}
