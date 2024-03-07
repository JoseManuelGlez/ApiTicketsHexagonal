package com.example.prueba.application.dtos.responses;

import com.example.prueba.domain.entities.enums.DestinationStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateDestinationResponse {
    private String id;
    private String destination;
    private String state;
    private String city;
    private DestinationStatus destinationStatus;
}
