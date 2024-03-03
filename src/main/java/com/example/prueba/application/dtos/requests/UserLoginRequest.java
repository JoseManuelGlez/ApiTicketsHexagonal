package com.example.prueba.application.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserLoginRequest {
    private String email;
    private String password;
}
