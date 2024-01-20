package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateUserResponse {
    private Long id;
    private String name;
    private String age;
    private String curp;
}
