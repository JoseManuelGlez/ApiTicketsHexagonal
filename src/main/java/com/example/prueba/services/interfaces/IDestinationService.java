package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateDestinationRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.entities.Destination;

public interface IDestinationService {
    BaseResponse create(CreateDestinationRequest request);

    BaseResponse list();

    Destination findDestinationByDestination(String destination);


}
