package com.example.prueba.controllers;

import com.example.prueba.controllers.dtos.requests.CreateUserRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.services.interfaces.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService service;

    @PostMapping
    public ResponseEntity<BaseResponse> create(@RequestBody @Valid CreateUserRequest request){
        BaseResponse baseResponse = service.create(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getHttpStatus());
    }
}
