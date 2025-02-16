package com.xyloflo.capstone.controller;

import com.xyloflo.capstone.model.WardrobeItem;
import com.xyloflo.capstone.service.UserService;     // Add this import
import com.xyloflo.capstone.service.WardrobeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wardrobe")
public class WardrobeItemController {
    private final WardrobeItemService wardrobeItemService;
    private final UserService userService;

    @Autowired
    public WardrobeItemController(WardrobeItemService wardrobeItemService, UserService userService) {
        this.wardrobeItemService = wardrobeItemService;
        this.userService = userService;
    }

    // For the ResponseEntity type mismatch, update your return types:
    @GetMapping("/{id}")
    public ResponseEntity<?> getWardrobeItem(@PathVariable Long id) {
        return wardrobeItemService.getWardrobeItem(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateWardrobeItem(@PathVariable Long id, @RequestBody WardrobeItem item) {
        return wardrobeItemService.updateWardrobeItem(id, item);
    }
}