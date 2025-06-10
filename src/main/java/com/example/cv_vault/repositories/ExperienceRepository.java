package com.example.cv_vault.repositories;


import com.example.cv_vault.entities.Experience;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    @Query("SELECT e FROM Experience e WHERE e.user.id = ?1")
    List<Experience> findExperiencesByUserId(Long userId);
}