package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateReservationRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;

public interface IReservationService {
    BaseResponse create(CreateReservationRequest request);
}
