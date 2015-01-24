package com.example.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class IdentityController {

    @RequestMapping("/")
    public String id() {
        return UUID.randomUUID().toString();
    }

}

