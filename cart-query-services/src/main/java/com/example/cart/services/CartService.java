package com.example.cart.services;

import java.util.List;
import java.util.Map;

public class CartService {

    /**
     * Start Processing Kafka Messages from the channel
     */
    public void process(Map<String, Map<Integer, List<byte[]>>> kafkaMessages) {
        for (Map.Entry<String, Map<Integer, List<byte[]>>> entry : kafkaMessages.entrySet()) {
            System.out.println("Topic:" + entry.getKey());
            entry.getValue().values().stream().forEach(System.out::println);
        }
    }
}
