package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateDestinationReportResponse {
    private UUID id;
    private String plat;
    private CapacityVehicleResponse capacity;
    private IdTravelResponse travelId;
    private IdUserResponse userId;
}
