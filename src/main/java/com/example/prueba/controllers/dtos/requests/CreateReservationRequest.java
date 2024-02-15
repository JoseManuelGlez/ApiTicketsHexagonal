package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateReservationRequest {
    private String date;
    private String time;
    private int seat;
    private String status;
    private float total;

    private String destination;
    private UUID userId;
    private String plat;
}
