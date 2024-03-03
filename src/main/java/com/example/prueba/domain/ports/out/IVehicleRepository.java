package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {
    Vehicle findCapacityByCapacity(int capacity);

    Vehicle findPlatByPlat(String plat);
}
