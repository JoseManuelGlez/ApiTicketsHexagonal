package com.example.prueba.application.controllers.dtos.requests;

import com.example.prueba.domain.entities.enums.DestinationStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateDestinationRequest {
    private String destination;
    private String state;
    private String city;
    private DestinationStatus destinationStatus;
}
