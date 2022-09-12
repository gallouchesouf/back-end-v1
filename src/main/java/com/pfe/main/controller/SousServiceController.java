package com.pfe.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.main.entity.SousService;
import com.pfe.main.repository.SousServiceRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@CrossOrigin(origins = "*")
@RestController()
public class SousServiceController {

    @Autowired
    private SousServiceRepository sousServiceRepository;

    @GetMapping("/SousService")
    public List<SousService> getAll() {
        return this.sousServiceRepository.findAll();
    }

    @GetMapping("/SousService/{id}")
    public SousService get(@RequestParam Long id) {
        return this.sousServiceRepository.findById(id).get();
    }
    
    @PostMapping("/SousService")
    public SousService ajouter(@RequestBody SousService entity) {
        return this.sousServiceRepository.save(entity);
    }
    
    @PutMapping(value="/SousService/{id}")
    public SousService modifier(@PathVariable Long id, @RequestBody SousService entity) {
        return this.sousServiceRepository.save(entity);
    }

    @DeleteMapping(value="/SousService/{id}")
    public void delete(@PathVariable Long id) {
         this.sousServiceRepository.deleteById(id);
    }
//id : id service
    @GetMapping("/SousService/service/{id}")
    public List<SousService> getsous(@PathVariable Long id) {
        System.out.println(id);
        return this.sousServiceRepository.findByServiceId(id);
        //return this.sousServiceRepository.findById(id).get();
    }

}
