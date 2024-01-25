package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateDestinationReportRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import org.springframework.stereotype.Repository;

public interface IDestinationReportService {
    BaseResponse create(CreateDestinationReportRequest request);
}
