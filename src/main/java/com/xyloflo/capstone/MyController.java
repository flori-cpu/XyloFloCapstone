package com.xyloflo.capstone;

import com.xyloflo.capstone.model.User; // Correct import for User
import com.xyloflo.capstone.service.UserService; // Correct import for UserService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users") // Base path for all user-related APIs
public class MyController {

    @Autowired
    private UserService userService;

    // Welcome endpoint ("/")
    @GetMapping("/")
    public String home() {
        return "Hello, World! Welcome to My Custom App!";
    }

    // GET: Fetch user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    // POST: Register a new user
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully!";
    }

    // POST: Login a user
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.validateLogin(user.getUsername(), user.getPassword());
    }
}