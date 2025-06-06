package com.example.cv_vault.services;


import com.example.cv_vault.dtos.SkillDto;

public interface SkillService {
    // DRUD operations for skills
    SkillDto getSkillById(Long id);
    SkillDto createSkill(SkillDto skillDto);
    SkillDto updateSkill(Long id, SkillDto skillDto);
    void deleteSkill(Long id);
}