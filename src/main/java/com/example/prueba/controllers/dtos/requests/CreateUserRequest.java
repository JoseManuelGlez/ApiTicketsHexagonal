package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateUserRequest {
    private String name;

    private String age;
    private String curp;
}
