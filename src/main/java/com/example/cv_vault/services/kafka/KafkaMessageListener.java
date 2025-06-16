package com.example.cv_vault.services.kafka;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {
  private final List<String> messages = new ArrayList<>();
  @KafkaListener(topics = "test-topic", groupId = "my-group")
  public void listen(String message) {
    System.out.println("Received message: " + message);
    messages.add(message);
  }

  @Scheduled(fixedRate = 60000)
  public void ShowBatchMessages() {
    if (!messages.isEmpty()) {
      System.out.println("Batch of messages received: " + messages);
      messages.clear();
    }
  }

}