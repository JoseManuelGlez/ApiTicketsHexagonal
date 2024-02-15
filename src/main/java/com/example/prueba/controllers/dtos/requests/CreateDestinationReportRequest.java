package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateDestinationReportRequest {
    private String plat;
    private int capacity;
    private UUID travelId;
    private UUID userId;
}
