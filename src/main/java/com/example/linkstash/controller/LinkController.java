package com.example.linkstash.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.linkstash.model.Link;
import com.example.linkstash.repository.LinkRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LinkController {


    private final LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, LinkStash!";
    }

    @PostMapping("/links")
    public Link createLinks(@RequestBody Link newLink) {
        
        Link savedLink = linkRepository.save(newLink);
        System.out.println("Saved link: " + savedLink);

        //System.out.println("Receieved link data: " + newLink);
        //System.out.println("URL:" + newLink.getUrl());    
        //System.out.println("Title:" + newLink.getTitle());
    
        return savedLink;
    }
    
}
