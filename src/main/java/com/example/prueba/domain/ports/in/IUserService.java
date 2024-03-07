package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreateUserRequest;
import com.example.prueba.application.dtos.requests.UserLoginRequest;
import com.example.prueba.application.dtos.responses.BaseResponse;
import com.example.prueba.domain.entities.User;

import java.util.List;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);

    User findIdById(String userId);

    BaseResponse login(UserLoginRequest request);

    List<User> findUsersByEmails(List<String> userIds);

    String findIdByEmail(String email);
}
