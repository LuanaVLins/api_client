package com.api.api_client.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api_client.Entity.Client;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
