package com.example.prueba.application.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateVehicleResponse {
    private UUID id;
    private int capacity;
    private String plat;
    private String availability;
    private String type;
    private DestinationResponse destination;
}
