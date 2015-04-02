package com.example.cart.services;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CartService {

    /**
     * Start Processing Kafka Messages from the channel
     */
    public void process(Map<String, Map<Integer, List<byte[]>>> kafkaMessages) {
        for (Map.Entry entry : kafkaMessages.entrySet()) {
            String topic = (String) entry.getKey();
            System.out.println("Topic:" + topic);
            ConcurrentHashMap<Integer, List<byte[]>> messages = (ConcurrentHashMap<Integer, List<byte[]>>) entry.getValue();
            Collection<List<byte[]>> values = messages.values();
            for (Iterator<List<byte[]>> iterator = values.iterator(); iterator.hasNext(); ) {
                List<byte[]> list = iterator.next();
                for (byte[] object : list) {
                    String message = new String(object);
                    System.out.println("\tMessage: " + message);
                }
            }
        }
    }
}
