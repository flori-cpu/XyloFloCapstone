package com.xyloflo.capstone.service;

import com.xyloflo.capstone.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceFacade {
  public User updateUser(User updatedUser) {
    // Validate user data
    if (updatedUser.getUsername() == null || updatedUser.getUsername().trim().isEmpty()) {
      throw new IllegalArgumentException("Username cannot be empty");
    }

    if (updatedUser.getEmail() == null || updatedUser.getEmail().trim().isEmpty()) {
      throw new IllegalArgumentException("Email cannot be empty");
    }

    // Additional validation if needed
    if (updatedUser.getPassword() == null || updatedUser.getPassword().trim().isEmpty()) {
      throw new IllegalArgumentException("Password cannot be empty");
    }

    // Additional logic...
    return updatedUser;
  }
}