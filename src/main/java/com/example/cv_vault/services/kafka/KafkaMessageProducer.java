package com.example.cv_vault.services.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageProducer {

  private final KafkaTemplate<String, String> kafkaTemplate;

  public KafkaMessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void send(String topic, String message) {
    kafkaTemplate.send(topic, message);
  }
}