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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.main.entity.Adress;
import com.pfe.main.repository.AdressRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AdressController {

	@Autowired
	private AdressRepository adressRepository;

	@GetMapping("/adress")
	public List<Adress> getAll() {
		return this.adressRepository.findAll();
	}

	@GetMapping("/adress/{id}")
	public Adress get(@PathVariable Long id) {
		return this.adressRepository.findById(id).get();
	}

	@PostMapping("/adress")
	public Adress ajouter(@RequestBody Adress entity) {
		return this.adressRepository.save(entity);
	}

	@PutMapping("/adress/{id}")
	public Adress modifier(@PathVariable Long id, @RequestBody Adress entity) {
		return this.adressRepository.save(entity);
	}

	@DeleteMapping("/adress/{id}")
	public void delete(@PathVariable Long id) {
		this.adressRepository.deleteById(id);
	}
}
