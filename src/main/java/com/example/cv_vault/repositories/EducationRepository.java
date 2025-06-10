package com.example.cv_vault.repositories;


import com.example.cv_vault.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
    Optional<Education> getEducationById(Long id);
    @Query("SELECT e FROM Education e WHERE e.user.id = ?1")
    List<Education> findEducationsByUserId(Long userId);
}