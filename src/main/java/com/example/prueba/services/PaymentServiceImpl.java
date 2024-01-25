package com.example.prueba.services;

import com.example.prueba.controllers.dtos.requests.CreatePaymentRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.controllers.dtos.responses.CreatePaymentResponse;
import com.example.prueba.entities.*;
import com.example.prueba.repositories.IPaymentRepository;
import com.example.prueba.services.interfaces.IPaymentService;
import com.example.prueba.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements IPaymentService {
    @Autowired
    private IPaymentRepository repository;

    @Autowired
    private IUserService userService;

    @Override
    public BaseResponse create(CreatePaymentRequest request) {
        Payment reservation = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(reservation)))
                .message("Reservation created corretly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    private Payment from(CreatePaymentRequest request){
        Payment payment = new Payment();

        payment.setType(request.getType());
        payment.setCost(request.getCost());

        User user = userService.findIdById(request.getUserId());

        payment.setUser(user);

        return payment;
    }

    private CreatePaymentResponse from(Payment payment){
        CreatePaymentResponse response = new CreatePaymentResponse();

        response.setId(payment.getId());
        response.setType(payment.getType());
        response.setCost(payment.getCost());

        return response;
    }
}
