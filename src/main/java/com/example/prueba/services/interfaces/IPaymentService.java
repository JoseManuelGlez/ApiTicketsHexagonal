package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreatePaymentRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;

public interface IPaymentService {
    BaseResponse create(CreatePaymentRequest request);
}
