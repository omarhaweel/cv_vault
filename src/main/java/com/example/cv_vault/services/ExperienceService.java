package com.example.cv_vault.services;


import com.example.cv_vault.dtos.ExperienceDto;

import java.util.List;

public interface ExperienceService {
    ExperienceDto createExperience(ExperienceDto experienceDto);
    ExperienceDto updateExperience(Long id, ExperienceDto experienceDto);
    void deleteExperience(Long id);
    List<ExperienceDto> findExperiencesByUserId(Long userId);
}
