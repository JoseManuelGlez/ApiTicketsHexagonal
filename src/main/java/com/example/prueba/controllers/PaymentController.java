package com.example.prueba.controllers;

import com.example.prueba.controllers.dtos.requests.CreatePaymentRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.services.interfaces.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private IPaymentService service;

    @PostMapping
    public ResponseEntity<BaseResponse> create(@RequestBody CreatePaymentRequest request) {
        BaseResponse baseResponse = service.create(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getHttpStatus());
    }
}
