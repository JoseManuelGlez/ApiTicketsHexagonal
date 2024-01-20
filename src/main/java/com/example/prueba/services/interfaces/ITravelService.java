package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateTravelRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;

public interface ITravelService {
    BaseResponse create(CreateTravelRequest request);
}
