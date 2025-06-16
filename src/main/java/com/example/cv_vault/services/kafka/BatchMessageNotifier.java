package com.example.cv_vault.services.kafka;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BatchMessageNotifier {

    private final KafkaMessageListener kafkaMessageListener;

    public BatchMessageNotifier(KafkaMessageListener kafkaMessageListener) {
        this.kafkaMessageListener = kafkaMessageListener;
    }

    @Scheduled(fixedRate = 10000)
    public void notifyBatchMessages() {
        System.out.println("🕒 Scheduled task is running...");
        kafkaMessageListener.ShowBatchMessages();
    }
}