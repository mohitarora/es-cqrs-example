package com.example.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {

    @RequestMapping("/")
    String id() {
        return "Hello Id";
    }

}

