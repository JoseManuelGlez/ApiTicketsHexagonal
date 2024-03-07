package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateDestinationReportRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.DestinationReport;
import com.example.prueba.domain.entities.User;

public interface IDestinationReportService {
    BaseResponse create(CreateDestinationReportRequest request);

    DestinationReport findDestinationReportByUserId(String user);
}
