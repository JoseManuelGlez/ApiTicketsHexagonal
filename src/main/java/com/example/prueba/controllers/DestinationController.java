package com.example.prueba.controllers;

import com.example.prueba.controllers.dtos.requests.CreateDestinationRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.services.interfaces.IDestinationService;
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
}
