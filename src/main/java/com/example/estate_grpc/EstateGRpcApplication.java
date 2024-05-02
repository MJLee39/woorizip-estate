package com.example.estate_grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstateGRpcApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(EstateGRpcApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}