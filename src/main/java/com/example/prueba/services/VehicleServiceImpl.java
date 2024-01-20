package com.example.prueba.services;

import com.example.prueba.controllers.dtos.requests.CreateVehicleRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.controllers.dtos.responses.CreateVehicleResponse;
import com.example.prueba.entities.Vehicle;
import com.example.prueba.repositories.IVehicleRepository;
import com.example.prueba.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements IVehicleService {
    @Autowired
    private IVehicleRepository repository;

    @Override
    public BaseResponse create(CreateVehicleRequest request) {
        Vehicle vehicle = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(vehicle)))
                .message("Vehicle created corretly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    private Vehicle from(CreateVehicleRequest request){
        Vehicle vehicle = new Vehicle();

        vehicle.setCapacity(request.getCapacity());
        vehicle.setLicensePlate(request.getLicensePlate());
        vehicle.setDestination(request.getDestination());

        return vehicle;
    }

    private CreateVehicleResponse from(Vehicle vehicle){
        CreateVehicleResponse response = new CreateVehicleResponse();

        response.setId(vehicle.getId());
        response.setCapacity(vehicle.getCapacity());
        response.setLicensePlate(vehicle.getLicensePlate());
        response.setDestination(vehicle.getDestination());

        return response;
    }
}
