package com.example.cv_vault.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "experiences")
@Data
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

    public Long getUserId() {
        return user != null ? user.getId() : null;
    }

    public void setUserId(Long userId) {
        if (user == null) {
            user = new User();
        }
        user.setId(userId);
    }
}
