package com.example.cart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CartService {

    @Autowired
    private QueueChannel channel;

    /**
     * Start Processing Kafka Messages from the channel
     */
    @PostConstruct
    public void init() {
        Message msg;
        while ((msg = channel.receive()) != null) {
            HashMap map = (HashMap) msg.getPayload();
            Set<Map.Entry> set = map.entrySet();
            for (Map.Entry entry : set) {
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
}
