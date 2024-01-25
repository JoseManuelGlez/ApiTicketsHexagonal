package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateTravelRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.entities.Travel;

public interface ITravelService {
    BaseResponse create(CreateTravelRequest request);

    Travel findIdById(Long travelId);
}
