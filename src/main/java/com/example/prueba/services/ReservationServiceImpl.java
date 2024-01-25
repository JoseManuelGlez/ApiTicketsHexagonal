package com.example.prueba.services;

import com.example.prueba.controllers.dtos.requests.CreateReservationRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.controllers.dtos.responses.CreateReservationResponse;
import com.example.prueba.entities.Destination;
import com.example.prueba.entities.Reservation;
import com.example.prueba.entities.User;
import com.example.prueba.entities.Vehicle;
import com.example.prueba.repositories.IReservationRepository;
import com.example.prueba.services.interfaces.IDestinationService;
import com.example.prueba.services.interfaces.IReservationService;
import com.example.prueba.services.interfaces.IUserService;
import com.example.prueba.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements IReservationService {
    @Autowired
    private IReservationRepository repository;

    @Autowired
    private IDestinationService destinationService;

    @Autowired
    private IUserService userService;

    @Autowired
    private IVehicleService vehicleService;

    @Override
    public BaseResponse create(CreateReservationRequest request) {
        Reservation reservation = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(reservation)))
                .message("Reservation created corretly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    private Reservation from(CreateReservationRequest request){
        Reservation reservation = new Reservation();

        reservation.setDate(request.getDate());
        reservation.setTime(request.getTime());
        reservation.setSeat(request.getSeat());
        reservation.setStatus(request.getStatus());
        reservation.setTotal(request.getTotal());

        Destination destination = destinationService.findDestinationByDestination(request.getDestination());
        User userId = userService.findIdById(request.getUserId());
        Vehicle vehicle = vehicleService.findPlatByPlat(request.getPlat());

        reservation.setDestination(destination);
        reservation.setUser(userId);
        reservation.setVehicle(vehicle);

        return reservation;
    }

    private CreateReservationResponse from(Reservation reservation){
        CreateReservationResponse response = new CreateReservationResponse();

        response.setId(reservation.getId());
        response.setDate(reservation.getDate());
        response.setTime(reservation.getTime());
        response.setSeat(reservation.getSeat());
        response.setStatus(reservation.getStatus());
        response.setTotal(reservation.getTotal());

        return response;
    }
}
