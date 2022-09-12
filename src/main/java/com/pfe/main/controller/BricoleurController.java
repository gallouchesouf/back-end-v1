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

import com.pfe.main.entity.Bricoleur;
import com.pfe.main.repository.BricoleurRepository;

@CrossOrigin(origins = "*")
@RestController()
public class BricoleurController  {

	
    @Autowired
    private BricoleurRepository bricoleurRepository;

    @GetMapping("/Bricoleur")
    public List<Bricoleur> getAll() {
        return this.bricoleurRepository.findAll();
    }

    @GetMapping("/Bricoleur/{id}")
    public Bricoleur get(@RequestParam Long id) {
        return this.bricoleurRepository.findById(id).get();
    }
    
    @PostMapping("/Bricoleur")
    public Bricoleur ajouter(@RequestBody Bricoleur entity) {
        return this.bricoleurRepository.save(entity);
    }
    
    @PutMapping("/Bricoleur/{id}")
    public Bricoleur modifier(@PathVariable Long id, @RequestBody Bricoleur entity) {
        return this.bricoleurRepository.save(entity);
    }

    @DeleteMapping("/Bricoleur/{id}")
    public void delete(@PathVariable Long id) {
         this.bricoleurRepository.deleteById(id);
    }
    
    
    @PostMapping("/Bricoleur/login")
    public Bricoleur getByEmailBrico( @RequestBody Bricoleur entity){
        return bricoleurRepository.findByEmailAndPassword(entity.getEmail(), entity.getPassword());
    }
}
