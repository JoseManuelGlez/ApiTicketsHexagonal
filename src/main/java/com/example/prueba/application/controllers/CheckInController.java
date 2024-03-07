package com.example.prueba.application.controllers;

import com.example.prueba.application.dtos.requests.UpdateCheckInRequest;
import com.example.prueba.domain.entities.CheckInCode;
import com.example.prueba.domain.ports.in.ICheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check-in")
public class CheckInController {
    @Autowired
    private ICheckInService service;

    @PostMapping
    public CheckInCode create(@RequestBody UpdateCheckInRequest request) {
        return service.update(request);
    }
}
