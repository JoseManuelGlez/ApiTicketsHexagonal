package com.example.prueba.application.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateDestinationReportResponse {
    private String id;
    private String plat;
    private CapacityVehicleResponse capacity;
    private IdTravelResponse travelId;
    private IdUserResponse userId;
}
