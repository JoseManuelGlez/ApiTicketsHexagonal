package com.example.prueba.domain.entities;

import com.example.prueba.domain.entities.enums.CheckInStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "check_in")
@Getter
@Setter
public class CheckInCode {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String code;

    @Enumerated(EnumType.STRING)
    private CheckInStatus status;
}
