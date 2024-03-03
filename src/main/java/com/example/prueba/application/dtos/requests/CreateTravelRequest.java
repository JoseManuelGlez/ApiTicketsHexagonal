package com.example.prueba.application.dtos.requests;

import com.example.prueba.domain.entities.enums.TravelType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateTravelRequest {
    private String date;
    private String time;

    private TravelType type;
}
