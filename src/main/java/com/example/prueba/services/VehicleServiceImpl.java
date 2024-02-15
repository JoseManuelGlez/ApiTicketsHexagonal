package com.example.prueba.services;

import com.example.prueba.controllers.dtos.requests.CreateVehicleRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.controllers.dtos.responses.CreateVehicleResponse;
import com.example.prueba.controllers.dtos.responses.DestinationResponse;
import com.example.prueba.entities.Destination;
import com.example.prueba.entities.Vehicle;
import com.example.prueba.repositories.IVehicleRepository;
import com.example.prueba.services.interfaces.IDestinationService;
import com.example.prueba.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements IVehicleService {
    @Autowired
    private IVehicleRepository repository;

    @Autowired
    private IDestinationService destinationService;

    @Override
    public BaseResponse create(CreateVehicleRequest request) {
        Vehicle vehicle = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(vehicle)))
                .message("Vehicle created corretly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    @Override
    public Vehicle findCapacityByCapacity(int capacity) {
        return repository.findCapacityByCapacity(capacity);
    }

    @Override
    public Vehicle findPlatByPlat(String licensePlat) {
        return repository.findPlatByPlat(licensePlat);
    }

    private Vehicle from(CreateVehicleRequest request){
        Vehicle vehicle = new Vehicle();

        vehicle.setCapacity(request.getCapacity());
        vehicle.setPlat(request.getPlat());
        vehicle.setAvailability(request.getAvailability());
        vehicle.setType(request.getType());
        Destination destination = destinationService.findDestinationByDestination(request.getDestination());

        vehicle.setDestination(destination);

        return vehicle;
    }

    private CreateVehicleResponse from(Vehicle vehicle){
        CreateVehicleResponse response = new CreateVehicleResponse();

        response.setId(vehicle.getId());
        response.setCapacity(vehicle.getCapacity());
        response.setPlat(vehicle.getPlat());
        response.setAvailability(vehicle.getAvailability());
        response.setType(vehicle.getType());
        response.setDestination(from(vehicle.getDestination()));

        return response;
    }

    private DestinationResponse from(Destination destination){
        DestinationResponse response = new DestinationResponse();

        response.setDestination(destination.getDestination());

        return response;
    }
}
