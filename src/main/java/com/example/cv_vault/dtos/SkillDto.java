package com.example.cv_vault.dtos;

import lombok.Data;
@Data
public class SkillDto {
    private Long id;
    private Long userId;
    private String skillName;
    private String description;

}
