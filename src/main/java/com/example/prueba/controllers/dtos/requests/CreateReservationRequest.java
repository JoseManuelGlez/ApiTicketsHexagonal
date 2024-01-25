package com.example.prueba.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateReservationRequest {
    private String date;
    private String time;
    private int seat;
    private String status;
    private float total;

    private String destination;
    private Long userId;
    private String plat;
}
