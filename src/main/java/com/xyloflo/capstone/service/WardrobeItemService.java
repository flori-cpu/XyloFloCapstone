package com.xyloflo.capstone.service;

import com.xyloflo.capstone.model.WardrobeItem;
import com.xyloflo.capstone.model.User;
import com.xyloflo.capstone.repository.WardrobeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WardrobeItemService {
    private final WardrobeItemRepository wardrobeItemRepository;

    @Autowired
    public WardrobeItemService(WardrobeItemRepository wardrobeItemRepository) {
        this.wardrobeItemRepository = wardrobeItemRepository;
    }

    public ResponseEntity<?> getWardrobeItem(Long id) {
        return wardrobeItemRepository.findById(id)
                .map(item -> ResponseEntity.ok().body(item))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<?> updateWardrobeItem(Long id, WardrobeItem item) {
        return wardrobeItemRepository.findById(id)
                .map(existingItem -> {
                    item.setId(id);
                    WardrobeItem updatedItem = wardrobeItemRepository.save(item);
                    return ResponseEntity.ok().body(updatedItem);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}