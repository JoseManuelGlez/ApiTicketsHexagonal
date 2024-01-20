package com.example.prueba.services;

import com.example.prueba.controllers.dtos.requests.CreateUserRequest;
import com.example.prueba.controllers.dtos.responses.BaseResponse;
import com.example.prueba.controllers.dtos.responses.CreateUserResponse;
import com.example.prueba.entities.User;
import com.example.prueba.repositories.IUserRepository;
import com.example.prueba.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository repository;

    @Override
    public BaseResponse create(CreateUserRequest request) {
        User user = from(request);

        return BaseResponse.builder()
                .data(from(repository.save(user)))
                .message("User created corretly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    private User from(CreateUserRequest request){
        User user = new User();

        user.setName(request.getName());
        user.setAge(request.getAge());
        user.setCurp(request.getCurp());

        return user;
    }

    private CreateUserResponse from(User user){
        CreateUserResponse response = new CreateUserResponse();

        response.setId(user.getId());
        response.setName(user.getName());
        response.setCurp(user.getAge());
        response.setName(user.getCurp());

        return response;
    }
}
