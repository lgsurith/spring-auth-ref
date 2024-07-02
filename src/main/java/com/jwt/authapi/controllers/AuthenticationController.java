package com.jwt.authapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.authapi.dtos.LoginUserDto;
import com.jwt.authapi.dtos.RegisterUserDto;
import com.jwt.authapi.service.AuthenticationService;
import com.jwt.authapi.service.jwtservice;
import com.jwt.authapi.model.User;
import com.jwt.authapi.responses.LoginResponse;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    private final jwtservice jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(jwtservice jwtService , AuthenticationService authenticationService){
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto){
        User registeredUser = authenticationService.signup(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);
        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse LoginResponse = new LoginResponse().setToken(jwtToken).setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(LoginResponse);

    }
}
