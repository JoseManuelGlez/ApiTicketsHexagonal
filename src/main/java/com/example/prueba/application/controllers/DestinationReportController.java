package com.example.prueba.application.controllers;

import com.example.prueba.application.dtos.requests.CreateDestinationReportRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.ports.in.IDestinationReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("destination-report")
public class DestinationReportController {
    @Autowired
    private IDestinationReportService service;

    @PostMapping
    public ResponseEntity<BaseResponse> create(@RequestBody CreateDestinationReportRequest request){
        BaseResponse baseResponse = service.create(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getHttpStatus());
    }
}
