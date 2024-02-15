package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateUserResponse {
    private UUID id;
    private String name;
    private String age;
    private String curp;
}
