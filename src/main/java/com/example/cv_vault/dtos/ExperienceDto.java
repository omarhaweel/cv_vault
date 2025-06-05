package com.example.cv_vault.dtos;

import java.time.LocalDate;

public class ExperienceDto {
    private Long id;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String jobTitle;
    private String companyName;
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
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", userId=" + userId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
