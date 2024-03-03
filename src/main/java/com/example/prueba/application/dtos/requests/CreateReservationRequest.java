package com.example.prueba.application.controllers.dtos.requests;

import com.example.prueba.domain.entities.User;
import com.example.prueba.domain.entities.enums.LuggageType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CreateReservationRequest {
    private String departureDate;
    private String returnDate;
    private String departureTime;
    private String returnTime;
    private int seat;
    private String status;
    private float total;
    private LuggageType luggageType;

    private String destination;
    private List<User> users;
    private String plat;
}
