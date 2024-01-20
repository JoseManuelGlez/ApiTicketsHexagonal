package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateVehicleRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;

public interface IVehicleService {
    BaseResponse create(CreateVehicleRequest request);
}
