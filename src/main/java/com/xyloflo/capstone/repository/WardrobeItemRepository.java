package com.xyloflo.capstone.repository;

import com.xyloflo.capstone.model.WardrobeItem;
import com.xyloflo.capstone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WardrobeItemRepository extends JpaRepository<WardrobeItem, Long> {
    // Find all wardrobe items for a specific user
    List<WardrobeItem> findByUser(User user);

    // Find items by user and type
    List<WardrobeItem> findByUserAndItemType(User user, String itemType);

    // Find items by user and color
    List<WardrobeItem> findByUserAndColor(User user, String color);

    // Find items by user and size
    List<WardrobeItem> findByUserAndSize(User user, String size);

    // Find items by name containing (case-insensitive)
    List<WardrobeItem> findByUserAndItemNameContainingIgnoreCase(User user, String itemName);
}