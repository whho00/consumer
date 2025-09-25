
package com.george.kafka.consumer1;

import org.springframework.stereotype.*;
import org.springframework.kafka.annotation.*;

@Service
public class OrderConsumer {
    @KafkaListener(topics = "orders", groupId = "order-group")
    public void consume(String message) {
        System.out.println("✅ Consumed order: " + message);
    }
}
