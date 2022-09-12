package com.pfe.main.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mission {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;  
		
	private String titre;
	 
    private String dateMission;
	
    private String descriptions;
	 
    private String prixMission;
  
    private Long clientId;

    private  Long serviceId;
    
    

}
