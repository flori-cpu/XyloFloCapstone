package com.example.careerstyle.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "wardrobe_item")
public class WardrobeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false, length = 50) // Ensures non-null and restricts length
    private String type; // e.g., Shirt, Pants, Dress

    @Column(length = 50)
    private String color; // e.g., Red, Blue, Black

    @Column(length = 50)
    private String material; // e.g., Cotton, Denim, Wool

    @Column(length = 50)
    private String occasion; // e.g., Casual, Formal, Business

    private LocalDate lastWornDate; // Represents when the item was last worn

    @ManyToOne // Many wardrobe items belong to one user
    @JoinColumn(name = "user_id", nullable = false) // Foreign key column in wardrobe_item table
    private User user; // Links wardrobe items to the user

    // Default constructor (required by JPA)
    public WardrobeItem() {
    }

    // Constructor
    public WardrobeItem(String type, String color, String material, String occasion, LocalDate lastWornDate, User user) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.occasion = occasion;
        this.lastWornDate = lastWornDate;
        this.user = user;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public LocalDate getLastWornDate() {
        return lastWornDate;
    }

    public void setLastWornDate(LocalDate lastWornDate) {
        this.lastWornDate = lastWornDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "WardrobeItem{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", occasion='" + occasion + '\'' +
                ", lastWornDate=" + lastWornDate +
                ", user=" + user +
                '}';
    }
}