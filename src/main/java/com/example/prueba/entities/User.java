package com.example.prueba.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;
    private String curp;

    @OneToOne(mappedBy = "user")
    private Reservation reservation;

    @OneToOne(mappedBy = "user")
    private DestinationReport destinationReport;

    @OneToMany(mappedBy = "user")
    private List<Payment> payments;
}
