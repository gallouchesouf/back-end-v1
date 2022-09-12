package com.pfe.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.main.entity.Client;
import com.pfe.main.repository.ClientRepository;

@CrossOrigin(origins = "*")
@RestController()
public class ClientController {

	@Autowired
    private ClientRepository clientRepository;

    @GetMapping("/Client")
    public List<Client> getAll() {
        return this.clientRepository.findAll();
    }

    @GetMapping("/Client/{id}")
    public Client get(@RequestParam Long id) {
        return this.clientRepository.findById(id).get();
    }
    
    @PostMapping("/Client")
    public Client ajouter(@RequestBody Client entity) {
        return this.clientRepository.save(entity);
    }
    
    @PutMapping(value="Client/{id}")
    public Client modifier(@PathVariable Long id, @RequestBody Client entity) {
        return this.clientRepository.save(entity);
    }

    @DeleteMapping(value="Client/{id}")
    public void delete(@PathVariable Long id) {
         this.clientRepository.deleteById(id);
    }
}
