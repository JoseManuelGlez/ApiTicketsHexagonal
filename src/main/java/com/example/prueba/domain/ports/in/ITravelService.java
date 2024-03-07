package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateTravelRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.Travel;

public interface ITravelService {
    BaseResponse create(CreateTravelRequest request);

    Travel findIdById(String travelId);
}
