package com.pfe.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.main.entity.Bricoleur;

@Repository
public interface BricoleurRepository extends JpaRepository<Bricoleur, Long> {
    
    Bricoleur findByEmailAndPassword (String email,String password);


}
