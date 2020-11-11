package com.programming.techie.sptingngblog.controller;

import com.programming.techie.sptingngblog.dto.RegisterRequest;
import com.programming.techie.sptingngblog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
//    FIXED THIS FUNCTION
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        if (registerRequest.getUsername() == null || registerRequest.getEmail() == null || registerRequest.getPassword() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else {
            authService.signup(registerRequest);
            return new ResponseEntity(HttpStatus.OK);
        }
    }


}
