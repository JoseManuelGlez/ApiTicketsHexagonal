package com.example.prueba.domain.entities;

import com.example.prueba.domain.entities.enums.LuggageType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "reservations")
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String departureDate;
    private String returnDate;
    private String departureTime;
    private String returnTime;
    private int seat;
    private String status;
    private float total;
    private LuggageType luggageType;

    @OneToOne
    @JoinColumn(name = "city", referencedColumnName = "city")
    private Destination destination;

    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<User> users;

    @OneToOne
    @JoinColumn(name = "plat", referencedColumnName = "plat")
    private Vehicle vehicle;
}
