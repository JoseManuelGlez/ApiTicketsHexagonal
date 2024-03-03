package com.example.prueba.application.controllers;

import com.example.prueba.application.dtos.requests.CreateTravelRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.ports.in.ITravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("travel")
public class TravelController {
    @Autowired
    private ITravelService service;

    @PostMapping
    public ResponseEntity<BaseResponse> create(@RequestBody CreateTravelRequest request){
        BaseResponse baseResponse = service.create(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getHttpStatus());
    }
}
