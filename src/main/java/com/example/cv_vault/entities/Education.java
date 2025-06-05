package com.example.cv_vault.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "educations")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;
    private String Grade;
    private String schoolName;
    private String description;
}