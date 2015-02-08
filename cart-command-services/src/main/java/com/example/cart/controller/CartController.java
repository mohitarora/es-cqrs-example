package com.example.cart.controller;

import com.example.cart.Application.KafkaGateway;
import com.example.cart.domain.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private KafkaGateway kafkaGateway;

    @RequestMapping
    public void addItem() {
        kafkaGateway.addItemToCart(new CartItem());
    }

}
