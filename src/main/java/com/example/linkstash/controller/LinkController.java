package com.example.linkstash.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LinkController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/links")
    public String createLinks(@RequestBody String linkData) {
        System.out.println("Receieved link data: " + linkData);
        return "Link created successfully!";
    }
    
}
