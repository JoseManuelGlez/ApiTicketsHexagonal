package com.example.prueba.application.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateVehicleRequest {
    private int capacity;
    private String plat;
    private String availability;
    private String type;
    private String destination;
}
