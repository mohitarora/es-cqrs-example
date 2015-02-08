package com.example.cart.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CartItem implements Serializable {

    private String key;

    private String topic;

}
