package com.pfe.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bricoleur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nom;

	private String prenom;

	private String cin;

	private String adresse;

	private String tel;

	private String password;

	private String email;

	private int anneexperience;

	private String apropos;
	
    private Long id_ville;
	
    private Long id_sousServices;

}
