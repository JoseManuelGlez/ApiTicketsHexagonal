package com.example.prueba.application.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateUserRequest {
    private String name;
    private String email;
    private String password;
}
