package com.example.cv_vault.dtos;

import java.time.LocalDate;

public class EducationDto {
    private Long id;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String grade;
    private String schoolName;
    private String description;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "EducationDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
