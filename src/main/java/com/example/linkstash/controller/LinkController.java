package com.example.linkstash.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.linkstash.model.Link;

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
    public String createLinks(@RequestBody Link newLink) {
        
        System.out.println("Receieved link data: " + newLink);
        System.out.println("URL:" + newLink.getUrl());    
        System.out.println("Title:" + newLink.getTitle());
    
        return "Link created successfully!";
    }
    
}
