package com.example.cv_vault.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    private String skillName;
    private String description;
}
