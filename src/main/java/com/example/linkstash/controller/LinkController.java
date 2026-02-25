package com.example.linkstash.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.linkstash.model.Link;
import com.example.linkstash.repository.LinkRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping ("/links")
    public List<Link> getAllLinks() {

        List<Link> allLinks = linkRepository.findAll();
        
        System.out.println("Retrieved Links: " + allLinks);
    
        return allLinks;
    }

    @GetMapping("/links/{id}")
    public ResponseEntity<Link> getLinkById(@PathVariable Long id) {
       
        //Link link = linkRepository.findById(id);
        Optional<Link> foundLink = linkRepository.findById(id);

        if (foundLink.isPresent()) {
            return ResponseEntity.ok(foundLink.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
}
