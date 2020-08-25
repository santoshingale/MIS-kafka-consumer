package com.example.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserMISListener {
    @KafkaListener(topics = "user_log", groupId = "group_id",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeJson(String user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
