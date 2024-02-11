package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePaymentResponse {
    private Long id;
    private String type;
    private double cost;
    private IdUserResponse userId;
}
