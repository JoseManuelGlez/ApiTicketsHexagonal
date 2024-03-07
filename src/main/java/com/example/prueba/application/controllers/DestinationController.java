package com.example.prueba.application.controllers;

import com.example.prueba.application.dtos.requests.CreateDestinationRequest;
import com.example.prueba.application.dtos.requests.GetDestinationRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.ports.in.IDestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("destination")
public class DestinationController {
    @Autowired
    private IDestinationService service;

    @PostMapping
    public ResponseEntity<BaseResponse> create(@RequestBody CreateDestinationRequest request) {
        BaseResponse baseResponse = service.create(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getHttpStatus());
    }

    @GetMapping
    public BaseResponse list() {
        return service.list();
    }

    @GetMapping("state-city")
    public ResponseEntity<BaseResponse> findDestinations(@RequestBody GetDestinationRequest request){
        BaseResponse baseResponse = service.findDestinationsByStateAndCity(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getHttpStatus());
    }
}
