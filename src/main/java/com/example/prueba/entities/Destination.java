package com.example.prueba.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "destinations")
@Getter
@Setter
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String destination;

    @OneToOne(mappedBy = "destination")
    private Reservation reservation;

    @OneToMany(mappedBy = "destination")
    private List<Vehicle> vehicles;
}
