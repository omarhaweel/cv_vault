package com.example.demo.services;

import com.example.demo.entities.Message;
import com.example.demo.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for handling message-related operations.
 */
@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getALlMessages() {
        return messageRepository.findAll();
    }
}