package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreatePaymentRequest {
    private String type;
    private double cost;
    private UUID userId;
}
