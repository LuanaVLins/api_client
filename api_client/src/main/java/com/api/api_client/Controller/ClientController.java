package com.api.api_client.Controller;


import java.util.List;


import com.api.api_client.Entity.Client;
import com.api.api_client.Repository.ClientRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    ClientRepository clientRepository;
    
    @PostMapping(value = "inserir")
    public Client saveClient(@RequestBody @Valid Client client) {
        return clientRepository.save(client);
    }

    @GetMapping(value = "listar")
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    @GetMapping("/obter/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientRepository.findById(id).get();
    }

    @PutMapping(value = "alterar")
    public void updateClient(@RequestBody @Valid Client client) {
        if(client.getId() > 0) {
            clientRepository.save(client);
        }
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteClient(@PathVariable Long id) {
        if(id > 0) {
            clientRepository.deleteById(id);
        }
    }

}