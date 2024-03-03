package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateDestinationRequest;
import com.example.prueba.application.dtos.requests.GetDestinationRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.Destination;

public interface IDestinationService {
    BaseResponse create(CreateDestinationRequest request);

    BaseResponse list();

    Destination findDestinationByDestination(String destination);

    BaseResponse findDestinationsByStateAndCity(GetDestinationRequest request);
}
