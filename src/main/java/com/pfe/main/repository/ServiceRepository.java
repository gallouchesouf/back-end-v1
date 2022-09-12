package com.pfe.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.main.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

}
