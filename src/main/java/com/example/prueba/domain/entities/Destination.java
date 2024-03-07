package com.example.prueba.domain.entities;

import com.example.prueba.domain.entities.enums.DestinationStatus;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true)
    private String state;

    @Column(unique = true)
    private String city;

    @Enumerated(EnumType.STRING)
    private DestinationStatus destinationStatus;

    @OneToOne(mappedBy = "destination")
    private Reservation reservation;

    @OneToMany(mappedBy = "destination")
    private List<Vehicle> vehicles;
}
