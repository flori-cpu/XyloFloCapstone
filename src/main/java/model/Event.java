package com.xyloflo.capstone.model;

import jakarta.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;  // Example: "Corporate Meeting"
    private String date;       // Example: "2023-11-12"
    private String time;       // Example: "14:00"
    private String dressCode;  // Example: "Business Casual"
    private String location;   // Example: "Downtown Hall"

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Links to the User entity
    private User user;

    // Default Constructor (JPA Requirement)
    public Event() {}

    // Parameterized Constructor (Optional)
    public Event(String eventName, String date, String time, String dressCode, String location, User user) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.dressCode = dressCode;
        this.location = location;
        this.user = user;
    }

    // Getters and Setters (Required for JPA)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}