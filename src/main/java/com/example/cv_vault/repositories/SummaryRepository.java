package com.example.cv_vault.repositories;


import com.example.cv_vault.entities.Summary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Long> {

    Optional<Summary> getSummaryById(Long id);

    @Query("SELECT s FROM Summary s WHERE s.user.id = ?1")
    Summary getSummaryByUserId(Long userId);
}