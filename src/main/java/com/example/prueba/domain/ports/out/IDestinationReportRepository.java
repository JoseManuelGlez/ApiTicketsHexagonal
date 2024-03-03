package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.entities.DestinationReport;
import com.example.prueba.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinationReportRepository extends JpaRepository<DestinationReport, Long> {
    DestinationReport findDestinationReportByUserId(User user);
}
