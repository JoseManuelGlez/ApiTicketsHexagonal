package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateReservationRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;

public interface IReservationService {
    BaseResponse create(CreateReservationRequest request);
}
