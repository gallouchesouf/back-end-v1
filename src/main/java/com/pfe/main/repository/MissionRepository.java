package com.pfe.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.main.entity.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

}
