package com.nagarro.myspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String getString() {
        return "Hello! This is a simple REST API Endpoint used for my docker application.";
    }
}
