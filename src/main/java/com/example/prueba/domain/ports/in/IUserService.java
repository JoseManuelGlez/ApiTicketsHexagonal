package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateUserRequest;
import com.example.prueba.application.dtos.requests.UserLoginRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);

    User findIdById(UUID userId);

    BaseResponse login(UserLoginRequest request);

    List<User> findUsers(List<User> users);

    User findIdByEmail(String email);
}
