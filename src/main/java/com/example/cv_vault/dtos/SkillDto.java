package com.example.cv_vault.dtos;

public class SkillDto {
    private Long id;
    private Long userId;
    private String skillName;
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
    public String getSkillName() {
        return skillName;
    }
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "SkillDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", skillName='" + skillName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
