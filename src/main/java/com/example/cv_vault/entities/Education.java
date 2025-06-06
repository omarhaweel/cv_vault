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

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return user != null ? user.getId() : null;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getGrade() {
        return Grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getDescription() {
        return description;
    }

    public void setUserId(Long userId) {
        if (user == null) {
            user = new User();
        }
        user.setId(userId);
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setGrade(String grade) {
        this.Grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}