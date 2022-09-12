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

import com.pfe.main.entity.Mission;
import com.pfe.main.repository.MissionRepository;

@CrossOrigin(origins = "*")
@RestController()
public class MissionController {

    @Autowired
    private MissionRepository missionRepository;

    @GetMapping("/Mission")
    public List<Mission> getAll() {
        return this.missionRepository.findAll();
    }

    @GetMapping("/Mission/{id}")
    public Mission get(@RequestParam Long id) {
        return this.missionRepository.findById(id).get();
    }
    
    @PostMapping("/Mission")
    public Mission ajouter(@RequestBody Mission entity) {
        return this.missionRepository.save(entity);
    }
    
    @PutMapping(value="/Mission/{id}")
    public Mission modifier(@PathVariable Long id, @RequestBody Mission entity) {
        return this.missionRepository.save(entity);
    }

    @DeleteMapping(value="/Mission/{id}")
    public void delete(@PathVariable Long id) {
         this.missionRepository.deleteById(id);
    }

}
