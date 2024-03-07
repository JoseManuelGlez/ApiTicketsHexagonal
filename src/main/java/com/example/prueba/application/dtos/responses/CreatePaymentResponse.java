package com.example.prueba.application.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePaymentResponse {
    private String id;
    private String type;
    private double cost;
    private IdUserResponse userId;
}
