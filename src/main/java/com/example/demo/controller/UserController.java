package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.LoginRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){

        return service.register(user);

    }

    @PostMapping("/login")
    public User login(@RequestBody LoginRequest login){

        return service.login(login.getEmail(), login.getPassword());

    }

}
