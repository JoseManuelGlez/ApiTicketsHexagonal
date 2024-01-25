package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateDestinationReportResponse {
    private Long id;
    private String plat;
    private int capacity;
    private Long travelId;
    private Long userId;
}
