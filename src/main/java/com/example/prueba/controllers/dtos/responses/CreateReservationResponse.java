package com.example.prueba.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateReservationResponse {
    private Long id;
    private String date;
    private String time;
    private int seat;
    private String status;
    private float total;

    private DestinationResponse destination;
    private IdUserResponse userId;
    private PlatVehicleResponse plat;
}
