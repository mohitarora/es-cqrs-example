package com.example.cart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {


    @RequestMapping
    public void addItem() {
        //kafkaGateway.addItemTocart();
    }

}
