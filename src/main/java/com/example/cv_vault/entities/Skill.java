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

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return user.getId();
    }

    public String getSkillName() {
        return skillName;
    }

    public String getDescription() {
        return description;
    }

    public void setUserId(Long userId) {
        if (this.user == null) {
            this.user = new User();
        }
        this.user.setId(userId);
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
