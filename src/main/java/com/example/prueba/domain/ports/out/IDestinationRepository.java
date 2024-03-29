package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDestinationRepository extends JpaRepository<Destination, String> {
    Destination findDestinationByCity(String destination);

    List<Destination> findDestinationsByStateAndCity(String state, String city);
}
