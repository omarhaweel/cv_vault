package com.example.cv_vault.dtos;

public class SummaryDto {
    private Long id;
    private Long userId;
    private String summaryText;
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
    public String getSummaryText() {
        return summaryText;
    }
    public void setSummaryText(String summaryText) {
        this.summaryText = summaryText;
    }
    @Override
    public String toString() {
        return "SummaryDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", summaryText='" + summaryText + '\'' +
                '}';
    }
}
