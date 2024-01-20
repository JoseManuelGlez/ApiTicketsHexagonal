package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateVehicleRequest {
    private int capacity;
    private String licensePlate;
    private String destination;
}
