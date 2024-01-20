package com.example.prueba.repositories;


import com.example.prueba.entities.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITravelRepository extends JpaRepository<Travel, Long> {
}
