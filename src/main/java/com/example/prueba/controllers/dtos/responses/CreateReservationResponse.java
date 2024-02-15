package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class CreateReservationResponse {
    private UUID id;
    private String date;
    private String time;
    private int seat;
    private String status;
    private float total;

    private DestinationResponse destination;
    private IdUserResponse userId;
    private PlatVehicleResponse plat;
}
