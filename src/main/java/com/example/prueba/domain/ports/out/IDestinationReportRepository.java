package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.entities.DestinationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinationReportRepository extends JpaRepository<DestinationReport, String> {

    @Query("SELECT dr FROM DestinationReport dr WHERE dr.user.id = ?1")
    DestinationReport findDestinationReportByUserId(String userId);
}
