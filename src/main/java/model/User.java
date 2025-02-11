package com.xyloflo.capstone.model; // Update your package path accordingly

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users") // This maps the class to the "users" table in your database
public class User {

    // Primary Key, Auto-Generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100) // Enforce username uniqueness and length
    private String username; // Column for Username

    @Column(nullable = false, length = 255) // Password is hashed, so length is extended
    private String password; // Column for Password

    @Column(nullable = false)
    private boolean enabled = true; // Indicates if the user is active (default: true)

    @Column(length = 50)
    private String roles; // String for user roles (e.g., ROLE_USER, ROLE_ADMIN)

    // One User has many WardrobeItems
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WardrobeItem> wardrobeItems;

    // One User has many events
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events;

    // Default Constructor (Required by JPA)
    public User() {
    }

    // Parameterized Constructor (Optional, for quick setup)
    public User(String username, String password, String roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<WardrobeItem> getWardrobeItems() {
        return wardrobeItems;
    }

    public void setWardrobeItems(List<WardrobeItem> wardrobeItems) {
        this.wardrobeItems = wardrobeItems;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    // Override toString() for debugging purposes
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}