package com.example.prueba.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "destinations")
@Getter
@Setter
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;

    @OneToOne(mappedBy = "destination")
    private Reservation reservation;

    @OneToMany(mappedBy = "destination")
    private List<Vehicle> vehicles;
}
