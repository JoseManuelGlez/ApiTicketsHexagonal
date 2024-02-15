package com.example.prueba.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "travels")
@Getter @Setter
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String date;
    private String time;

    @OneToOne(mappedBy = "travel")
    private DestinationReport destinationReport;
}
