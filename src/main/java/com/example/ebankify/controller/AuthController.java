package com.example.ebankify.controller;

import com.example.ebankify.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
@CrossOrigin(origins = "http://localhost:8080")
@AllArgsConstructor
public class AuthController {
    private UserService userService;

}
