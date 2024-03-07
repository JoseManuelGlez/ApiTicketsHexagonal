package com.example.prueba.application.dtos.responses;

import com.example.prueba.domain.entities.enums.TravelType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateTravelResponse {
    private String id;
    private String date;
    private String time;
    private TravelType type;
}
