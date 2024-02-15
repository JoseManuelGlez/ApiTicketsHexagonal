package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateUserRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.entities.User;

import java.util.UUID;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);

    User findIdById(UUID userId);
}
