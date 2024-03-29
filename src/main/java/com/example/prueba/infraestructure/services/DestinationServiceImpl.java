package com.example.prueba.infraestructure.services;

import com.example.prueba.application.dtos.requests.CreateDestinationRequest;
import com.example.prueba.application.dtos.requests.GetDestinationRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.application.dtos.responses.CreateDestinationResponse;
import com.example.prueba.domain.entities.Destination;
import com.example.prueba.domain.entities.enums.DestinationStatus;
import com.example.prueba.domain.ports.out.IDestinationRepository;
import com.example.prueba.domain.ports.in.IDestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DestinationServiceImpl implements IDestinationService {
    @Autowired
    private IDestinationRepository repository;

    @Override
    public BaseResponse create(CreateDestinationRequest request) {
        Destination user = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(user)))
                .message("Destination created correctly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    @Override
    public BaseResponse list() {
        List<CreateDestinationResponse> destinations = repository.findAll()
                .stream()
                .map(this::from)
                .collect(Collectors.toList());

        return BaseResponse.builder()
                .data(destinations)
                .message("Destinations found")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK).build();
    }

    @Override
    public Destination findDestinationByDestination(String destination) {
        return repository.findDestinationByCity(destination);
    }

    @Override
    public BaseResponse findDestinationsByStateAndCity(GetDestinationRequest request) {
        List<Destination> destinations = repository.findDestinationsByStateAndCity(request.getState(), request.getCity());

        List<CreateDestinationResponse> destinationDTOs = destinations.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());

        return BaseResponse.builder()
                .data(destinationDTOs)
                .message("Destinations found")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK).build();
    }

    private Destination from(CreateDestinationRequest request){
        Destination destination = new Destination();

        destination.setCity(request.getCity());
        destination.setState(request.getState());
        destination.setDestinationStatus(request.getDestinationStatus());

        return destination;
    }

    private CreateDestinationResponse from(Destination destination){
        CreateDestinationResponse response = new CreateDestinationResponse();

        response.setId(destination.getId());
        response.setCity(destination.getCity());
        response.setState(destination.getState());
        response.setDestinationStatus(destination.getDestinationStatus());

        return response;
    }

    private CreateDestinationResponse convertToDTO(Destination destination) {
        CreateDestinationResponse dto = new CreateDestinationResponse();
        dto.setId(destination.getId());
        dto.setState(destination.getState());
        dto.setCity(destination.getCity());
        dto.setDestinationStatus(destination.getDestinationStatus());

        return dto;
    }
}
