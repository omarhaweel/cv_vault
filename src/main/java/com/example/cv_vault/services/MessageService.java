package com.example.cv_vault.services;

import com.example.cv_vault.entities.Message;
import com.example.cv_vault.repositories.MessageRepository;
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