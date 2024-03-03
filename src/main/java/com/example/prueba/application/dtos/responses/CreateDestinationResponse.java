package com.example.prueba.application.controllers.dtos.responses;

import com.example.prueba.domain.entities.enums.DestinationStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateDestinationResponse {
    private UUID id;
    private String destination;
    private String state;
    private String city;
    private DestinationStatus destinationStatus;
}
