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

import com.pfe.main.entity.Service;
import com.pfe.main.repository.ServiceRepository;

@CrossOrigin(origins = "*")
@RestController()
public class ServiceController{

    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping("/Service")
    public List<Service> getAll() {
        return this.serviceRepository.findAll();
    }

    @GetMapping("/Service/{id}")
    public Service get(@RequestParam Long id) {
        return this.serviceRepository.findById(id).get();
    }
    
    @PostMapping("/Service")
    public Service ajouter(@RequestBody Service entity) {
        return this.serviceRepository.save(entity);
    }
    
    @PutMapping(value="/Service/{id}")
    public Service modifier(@PathVariable Long id, @RequestBody Service entity) {
        return this.serviceRepository.save(entity);
    }

    @DeleteMapping(value="/Service/{id}")
    public void delete(@PathVariable Long id) {
         this.serviceRepository.deleteById(id);
    }

}
