package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateTravelRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.Travel;

import java.util.UUID;

public interface ITravelService {
    BaseResponse create(CreateTravelRequest request);

    Travel findIdById(UUID travelId);
}
