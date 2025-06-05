package com.example.cv_vault.repositories;


import com.example.cv_vault.entities.Summary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Long> {

}