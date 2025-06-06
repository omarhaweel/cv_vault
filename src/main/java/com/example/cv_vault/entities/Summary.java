package com.example.cv_vault.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "summaries")
public class Summary {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    private String summaryText;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return user != null ? user.getId() : null;
    }

    public String getSummaryText() {
        return summaryText;
    }

    public void setUserId(Long userId) {
        if (user == null) {
            user = new User();
        }
        user.setId(userId);
    }

    public void setSummaryText(String summaryText) {
        this.summaryText = summaryText;
    }
}
