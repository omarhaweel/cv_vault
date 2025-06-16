package com.example.cv_vault.controllers.kafka;

import com.example.cv_vault.services.kafka.KafkaMessageProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaTestController {

  private final KafkaMessageProducer producer;

  public KafkaTestController(KafkaMessageProducer producer) {
    this.producer = producer;
  }

  @PostMapping("/send")
  public ResponseEntity<String> sendMessage(@RequestParam String message) {
    producer.send("test-topic-omar-kafka", message);
    return ResponseEntity.ok("Send Test Message: " + message);
  }
}