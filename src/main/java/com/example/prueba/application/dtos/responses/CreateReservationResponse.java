package com.example.prueba.application.dtos.responses;

import com.example.prueba.domain.entities.User;
import com.example.prueba.domain.entities.enums.LuggageType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CreateReservationResponse {
    private String id;
    private String departureDate;
    private String returnDate;
    private String departureTime;
    private String returnTime;
    private int seat;
    private String status;
    private float total;
    private LuggageType luggageType;

    private DestinationResponse destination;
    private List<User> users;
    private PlatVehicleResponse plat;
}
