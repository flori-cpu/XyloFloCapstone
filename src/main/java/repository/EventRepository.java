package com.xyloflo.capstone.repository;

import com.xyloflo.capstone.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Additional custom queries can be added here if needed
}