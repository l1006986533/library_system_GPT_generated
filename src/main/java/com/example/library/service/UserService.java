package com.example.library.service;

import com.example.library.dto.LoginRequest;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Handles user login logic.
     *
     * @param loginRequest the login request containing username and password
     * @return true if login is successful, false otherwise
     */
    public boolean login(LoginRequest loginRequest) {
        Optional<User> user = userRepository.findByUsername(loginRequest.getUsername());
        return user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword());
    }

    /**
     * Handles user registration logic.
     *
     * @param user the user information to register
     * @return the registered user
     */
    public User register(User user) {
        return userRepository.save(user);
    }
}
