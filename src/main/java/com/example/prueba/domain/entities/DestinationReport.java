package com.example.prueba.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "destination_reports")
@Getter
@Setter
public class DestinationReport {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

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
