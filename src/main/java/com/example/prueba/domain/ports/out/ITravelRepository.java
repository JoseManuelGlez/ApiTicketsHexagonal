package com.example.prueba.domain.ports.out;


import com.example.prueba.domain.entities.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITravelRepository extends JpaRepository<Travel, String> {
    Travel findIdById(String travelId);
}
