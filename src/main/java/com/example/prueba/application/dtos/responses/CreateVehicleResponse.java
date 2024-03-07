package com.example.prueba.application.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateVehicleResponse {
    private String id;
    private int capacity;
    private String plat;
    private String availability;
    private String type;
    private DestinationResponse destination;
}
