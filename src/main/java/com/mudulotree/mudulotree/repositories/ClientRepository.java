package com.mudulotree.mudulotree.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mudulotree.mudulotree.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}   
