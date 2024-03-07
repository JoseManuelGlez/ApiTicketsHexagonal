package com.example.prueba.infraestructure.services;

import com.example.prueba.application.dtos.requests.CreateDestinationReportRequest;
import com.example.prueba.application.dtos.responses.*;
import com.example.prueba.domain.entities.DestinationReport;
import com.example.prueba.domain.entities.Travel;
import com.example.prueba.domain.entities.User;
import com.example.prueba.domain.entities.Vehicle;
import com.example.prueba.domain.ports.out.IDestinationReportRepository;
import com.example.prueba.domain.ports.in.IDestinationReportService;
import com.example.prueba.domain.ports.in.ITravelService;
import com.example.prueba.domain.ports.in.IUserService;
import com.example.prueba.domain.ports.in.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DestinationReportServiceImpl implements IDestinationReportService {
    @Autowired
    private IDestinationReportRepository repository;

    @Autowired
    private IVehicleService vehicleService;

    @Autowired
    private ITravelService travelService;

    @Autowired
    private IUserService userService;

    @Override
    public BaseResponse create(CreateDestinationReportRequest request) {
        DestinationReport destinationReport = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(destinationReport)))
                .message("Destination report created corretly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    @Override
    public DestinationReport findDestinationReportByUserId(String user) {
        return repository.findDestinationReportByUserId(user);
    }

    private DestinationReport from(CreateDestinationReportRequest request){
        DestinationReport destinationReport = new DestinationReport();

        destinationReport.setPlat(request.getPlat());

        Vehicle vehicle = vehicleService.findCapacityByCapacity(request.getCapacity());
        Travel travelId = travelService.findIdById(request.getTravelId());
        User userId = userService.findIdById(request.getUserId());

        destinationReport.setTravel(travelId);
        destinationReport.setVehicle(vehicle);
        destinationReport.setUser(userId);

        return destinationReport;
    }

    private CreateDestinationReportResponse from(DestinationReport destinationReport){
        CreateDestinationReportResponse response = new CreateDestinationReportResponse();

        response.setId(destinationReport.getId());
        response.setPlat(destinationReport.getPlat());

        response.setCapacity(from(destinationReport.getVehicle()));
        response.setUserId(from(destinationReport.getUser()));
        response.setTravelId(from(destinationReport.getTravel()));

        return response;
    }

    private CapacityVehicleResponse from(Vehicle vehicle){
        CapacityVehicleResponse response = new CapacityVehicleResponse();

        response.setCapacity(vehicle.getCapacity());

        return response;
    }

    private IdTravelResponse from(Travel travel){
        IdTravelResponse response = new IdTravelResponse();

        response.setIdTravel(travel.getId());

        return response;
    }

    private IdUserResponse from(User user){
        IdUserResponse response = new IdUserResponse();

        response.setIdUser(user.getId());

        return response;
    }
}
