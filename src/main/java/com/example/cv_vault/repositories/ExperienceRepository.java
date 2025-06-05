package com.example.cv_vault.repositories;


import com.example.cv_vault.entities.Experience;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

}