package com.example.prueba.services.interfaces;

import com.example.prueba.controllers.dtos.requests.CreateUserRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.entities.User;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);

    User findIdById(Long userId);
}
