package com.example.prueba.application.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserLoginResponse {
    private String id;
    private String email;
    private String password;
}
