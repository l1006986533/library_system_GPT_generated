package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Method to find a user by username
    Optional<User> findByUsername(String username);

    // Method to save a user
    User save(User user);
}
