package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateTravelResponse {
    private UUID id;
    private String date;
    private String time;
}
