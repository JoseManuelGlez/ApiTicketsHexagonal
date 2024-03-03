package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateVehicleRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.Vehicle;

public interface IVehicleService {
    BaseResponse create(CreateVehicleRequest request);

    Vehicle findCapacityByCapacity(int capacity);

    Vehicle findPlatByPlat(String licensePlat);
}
