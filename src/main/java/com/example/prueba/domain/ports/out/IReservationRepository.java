package com.example.prueba.repositories;

import com.example.prueba.domain.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}
