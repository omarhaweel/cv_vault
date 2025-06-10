package com.example.cv_vault.dtos;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EducationDto {
    private Long id;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String grade;
    private String schoolName;
    private String description;
}
