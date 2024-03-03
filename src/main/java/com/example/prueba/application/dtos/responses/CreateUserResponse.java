package com.example.prueba.application.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateUserResponse {
    private UUID id;
    private String name;
    private String email;
    private String password;
}
