package com.example.prueba.application.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateDestinationReportRequest {
    private String plat;
    private int capacity;
    private String travelId;
    private String userId;
}
