package com.example.cv_vault.services.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {

  @KafkaListener(topics = "my-topic", groupId = "my-group")
  public void listen(String message) {
    System.out.println("Received message: " + message);
    // a received messagge can be processed here
    // like saving to the db
  }
}