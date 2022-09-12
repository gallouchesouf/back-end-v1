package com.pfe.main.repository;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.main.entity.SousService;

@Repository
public interface SousServiceRepository extends JpaRepository<SousService, Long> {
    @Query("SELECT t FROM sous_service t WHERE t.service_id = ?1 ")
    List<SousService> findByServiceId(Long service_id);
}
