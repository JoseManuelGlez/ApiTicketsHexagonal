package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateTravelResponse {
    private Long id;
    private String date;
    private String time;
}
