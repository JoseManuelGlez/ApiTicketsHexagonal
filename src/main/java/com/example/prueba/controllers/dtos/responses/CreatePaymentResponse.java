package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreatePaymentResponse {
    private UUID id;
    private String type;
    private double cost;
    private IdUserResponse userId;
}
