package com.example.cv_vault.services;


import com.example.cv_vault.dtos.SkillDto;

import java.util.List;

public interface SkillService {
    // DRUD operations for skills
    SkillDto createSkill(SkillDto skillDto);
    SkillDto updateSkill(Long id, SkillDto skillDto);
    List<SkillDto> getAllSkillsByUserID(Long id);
    void deleteSkill(Long id);
}