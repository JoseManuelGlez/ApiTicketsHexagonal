package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateDestinationReportRequest {
    private String plat;
    private int capacity;
    private Long travelId;
    private Long userId;
}
