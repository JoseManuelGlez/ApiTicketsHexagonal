package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.entities.CheckInCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICheckInRepository extends JpaRepository<CheckInCode, String> {
    CheckInCode findCodeByCode(String code);
}
