package com.example.prueba.application.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class UpdateCheckInCodeResponse {
    private UUID id;
    private String code;
}
