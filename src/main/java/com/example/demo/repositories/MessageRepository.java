package com.example.demo.repositories;

import com.example.demo.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing Message entities.
 * This interface extends JpaRepository to provide CRUD operations.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {


}