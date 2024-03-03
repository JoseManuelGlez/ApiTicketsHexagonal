package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateDestinationReportRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.DestinationReport;
import com.example.prueba.domain.entities.User;

public interface IDestinationReportService {
    BaseResponse create(CreateDestinationReportRequest request);

    DestinationReport findDestinationReportByUserId(User user);
}
