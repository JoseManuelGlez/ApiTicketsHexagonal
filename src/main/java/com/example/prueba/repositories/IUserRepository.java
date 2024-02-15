package com.example.prueba.repositories;

import com.example.prueba.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findIdById(UUID userId);
}
