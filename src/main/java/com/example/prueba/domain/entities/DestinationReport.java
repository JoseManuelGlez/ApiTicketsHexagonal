package com.example.prueba.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "destination_reports")
@Getter
@Setter
public class DestinationReport {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String plat;

    @OneToOne
    @JoinColumn(name = "capacity", referencedColumnName = "capacity")
    private Vehicle vehicle;

    @OneToOne
    @JoinColumn(name = "travel_id", referencedColumnName = "id")
    private Travel travel;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
