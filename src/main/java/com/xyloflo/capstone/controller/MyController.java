package com.xyloflo.capstone.controller;

import com.xyloflo.capstone.model.User;
import com.xyloflo.capstone.model.WardrobeItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    // If you have any services, inject them here
    // @Autowired
    // private UserService userService;

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Service is running");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/v2/users")
    public ResponseEntity<User> createUserV2(@RequestBody User user) {  // Changed method name here
        return ResponseEntity.ok().build();
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{userId}/wardrobe")
    public ResponseEntity<List<WardrobeItem>> getUserWardrobeItems(@PathVariable Long userId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/users/{userId}/wardrobe")
    public ResponseEntity<WardrobeItem> addWardrobeItem(
            @PathVariable Long userId,
            @RequestBody WardrobeItem wardrobeItem) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/users/{userId}/wardrobe/{itemId}")
    public ResponseEntity<Void> removeWardrobeItem(
            @PathVariable Long userId,
            @PathVariable Long itemId) {
        return ResponseEntity.ok().build();
    }
}