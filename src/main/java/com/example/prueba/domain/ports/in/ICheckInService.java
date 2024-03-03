package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.UpdateCheckInRequest;
import com.example.prueba.domain.entities.CheckInCode;

public interface ICheckInService {
    CheckInCode create(String status);

    CheckInCode update(UpdateCheckInRequest request);
}
