package com.example.cv_vault.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExperienceDto {
    private Long id;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String jobTitle;
    private String companyName;
    private String description;

}
