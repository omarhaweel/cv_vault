package com.example.cv_vault.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "summaries")
@Data
public class Summary {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    private String summaryText;

    public void setUserId(Long userId) {
        if (this.user == null) {
            this.user = new User();
        }
        this.user.setId(userId);
    }

    public Long getUserId() {
        return this.user != null ? this.user.getId() : null;
    }
}
