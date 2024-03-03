package com.example.prueba.controllers;

import com.example.prueba.controllers.dtos.requests.CreateDestinationReportRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
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
