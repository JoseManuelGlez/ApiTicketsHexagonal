package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateVehicleResponse {
    private Long id;
    private int capacity;
    private String licensePlate;
    private String destination;
}
