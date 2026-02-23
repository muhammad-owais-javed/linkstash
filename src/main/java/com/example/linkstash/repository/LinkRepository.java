package com.example.linkstash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.linkstash.model.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long>{
    
}
