package com.example.prueba.infraestructure.services;

import com.example.prueba.application.dtos.requests.CreateReservationRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.application.dtos.responses.CreateReservationResponse;
import com.example.prueba.application.dtos.responses.DestinationResponse;
import com.example.prueba.application.dtos.responses.PlatVehicleResponse;
import com.example.prueba.domain.entities.Destination;
import com.example.prueba.domain.entities.Reservation;
import com.example.prueba.domain.entities.User;
import com.example.prueba.domain.entities.Vehicle;
import com.example.prueba.domain.ports.out.IReservationRepository;
import com.example.prueba.domain.ports.in.IDestinationService;
import com.example.prueba.domain.ports.in.IReservationService;
import com.example.prueba.domain.ports.in.IUserService;
import com.example.prueba.domain.ports.in.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

        reservation.setDepartureDate(request.getDepartureDate());
        reservation.setReturnDate(request.getReturnDate());
        reservation.setDepartureTime(request.getDepartureTime());
        reservation.setReturnTime(request.getReturnTime());
        reservation.setSeat(request.getSeat());
        reservation.setStatus(request.getStatus());
        reservation.setTotal(request.getTotal());
        reservation.setLuggageType(request.getLuggageType());

        Destination destination = destinationService.findDestinationByDestination(request.getDestination());
        List<String> emails = request.getUsers().stream()
                .map(User::getEmail)
                .collect(Collectors.toList());

        List<User> users = userService.findUsersByEmails(emails);
        Vehicle vehicle = vehicleService.findPlatByPlat(request.getPlat());
        reservation.setDestination(destination);
        reservation.setUsers(users);
        reservation.setVehicle(vehicle);

        return reservation;
    }

    private CreateReservationResponse from(Reservation reservation){
        CreateReservationResponse response = new CreateReservationResponse();

        response.setId(reservation.getId());
        response.setDepartureDate(reservation.getDepartureDate());
        response.setReturnDate(reservation.getReturnDate());
        response.setDepartureTime(reservation.getDepartureTime());
        response.setReturnTime(reservation.getReturnTime());
        response.setSeat(reservation.getSeat());
        response.setStatus(reservation.getStatus());
        response.setTotal(reservation.getTotal());
        response.setLuggageType(reservation.getLuggageType());

        response.setUsers(reservation.getUsers());
        response.setPlat(from(reservation.getVehicle()));
        response.setDestination(from(reservation.getDestination()));

        return response;
    }

    private PlatVehicleResponse from(Vehicle vehicle){
        PlatVehicleResponse response = new PlatVehicleResponse();

        response.setPlat(vehicle.getPlat());

        return response;
    }

    private DestinationResponse from(Destination destination){
        DestinationResponse response = new DestinationResponse();

        response.setDestination(destination.getCity());

        return response;
    }
}
