package com.xyloflo.capstone;

import com.xyloflo.capstone.service.UserService;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(Long userId);

    Optional<User> getUserByUsername(String username);

    Optional<User> getUserByEmail(String email);

    void registerUser(User user);

    User validateLogin(String username, String password);
}