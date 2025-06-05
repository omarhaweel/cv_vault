package com.example.cv_vault.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;
    private String jobTitle;
    private String companyName;
    private String description;
}
