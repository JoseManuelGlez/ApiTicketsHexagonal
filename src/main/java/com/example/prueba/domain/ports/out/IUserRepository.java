package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    User findIdById(String userId);

    User findUserByEmailAndPassword(String email, String password);

    @Query("SELECT u.id FROM User u WHERE u.email = ?1")
    String findIdByEmail(String email);

    List<User> findByEmailIn(List<String> emails);

}
