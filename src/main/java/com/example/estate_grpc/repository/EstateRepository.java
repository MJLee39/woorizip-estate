package com.example.estate_grpc.repository;

import com.example.estate_grpc.entity.Estate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstateRepository extends JpaRepository<Estate,String> {

}
