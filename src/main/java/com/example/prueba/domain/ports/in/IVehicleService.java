package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateVehicleRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.Vehicle;

public interface IVehicleService {
    BaseResponse create(CreateVehicleRequest request);

    Vehicle findCapacityByCapacity(int capacity);

    Vehicle findPlatByPlat(String licensePlat);
}
