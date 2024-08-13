package com.example.library.controller;

import com.example.library.dto.LoginRequest;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    /**
     * Handles user login requests.
     *
     * @param loginRequest the login request containing username and password
     * @return login result as a boolean
     */
    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }

    /**
     * Returns the home page view.
     *
     * @return the home page view
     */
    @GetMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("home");
    }
}
