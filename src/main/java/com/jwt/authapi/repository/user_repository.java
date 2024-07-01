package com.jwt.authapi.repository;

import com.jwt.authapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface user_repository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);
}
