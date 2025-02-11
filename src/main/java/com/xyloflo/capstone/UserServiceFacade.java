package com.xyloflo.capstone.service;

import com.xyloflo.capstone.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceFacade {

  private final UserService userService;

  @Autowired
  public UserServiceFacade(UserService userService) {
    this.userService = userService;
  }

  // Find User by ID
  public User getUserById(Long id) {
    Optional<User> userOptional = userService.findUserById(id);
    return userOptional.orElseThrow(
            () -> new RuntimeException("User not found with ID: " + id)
    );
  }

  // Fetch All Users
  public List<User> getAllUsers() {
    return userService.findAllUsers();
  }

  // Create New User
  public User createUser(User user) {
    return userService.saveUser(user);
  }

  // Update Existing User
  public User updateUser(Long id, User updatedUser) {
    Optional<User> existingUserOptional = userService.findUserById(id);
    if (existingUserOptional.isPresent()) {
      User existingUser = existingUserOptional.get();
      existingUser.setName(updatedUser.getName());
      existingUser.setEmail(updatedUser.getEmail());
      existingUser.setRoles(updatedUser.getRoles());
      return userService.saveUser(existingUser);
    } else {
      throw new RuntimeException("User not found with ID: " + id);
    }
  }

  // Delete User by ID
  public void deleteUserById(Long id) {
    userService.deleteUserById(id);
  }
}