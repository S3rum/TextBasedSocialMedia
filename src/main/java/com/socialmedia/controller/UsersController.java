package com.socialmedia.controller;

import com.socialmedia.model.Users;
import com.socialmedia.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    private final UsersService userService;

    @Autowired
    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Users user) {
        // Validate input and encode the password (not shown in this example)
        // Save the user to the database
        Users savedUser = userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully");
    }
}
