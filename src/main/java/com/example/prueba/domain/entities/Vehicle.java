package com.example.prueba.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicles")
@Getter @Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private int capacity;
    private String plat;
    private String availability;
    private String type;

    @OneToOne(mappedBy = "vehicle")
    private Reservation reservation;

    @OneToOne(mappedBy = "vehicle")
    private DestinationReport destinationReport;

    @ManyToOne
    @JoinColumn(name = "city", referencedColumnName = "city")
    private Destination destination;
}
