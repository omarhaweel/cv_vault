package com.example.cv_vault.repositories;

import com.example.cv_vault.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    @Query("SELECT s FROM Skill s WHERE s.user.id = ?1")
    Optional<Skill> getSkillsByUserId(Long id);
    Optional<Skill> getSkillById(Long id);
}