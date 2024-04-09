package com.example.estate_grpc.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EstateUpdateDTO {

    private String id;

    private String location;

    private String estateType;

    private String direction;

    private int totalFloor;

    private int buildingFloor;

    private int room;

    private int toilet;

    private String hashtag;

    private double m2;

}
