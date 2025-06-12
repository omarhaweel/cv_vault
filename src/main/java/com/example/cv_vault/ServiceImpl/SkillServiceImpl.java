package com.example.cv_vault.ServiceImpl;


import com.example.cv_vault.dtos.SkillDto;
import com.example.cv_vault.entities.Skill;
import com.example.cv_vault.repositories.SkillRepository;
import com.example.cv_vault.services.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {



    private final SkillRepository skillRepository;
    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }


    @Override
    public SkillDto createSkill(SkillDto skillDto) {
        Skill skill = new Skill();
        skill.setUserId(skillDto.getUserId());
        skill.setSkillName(skillDto.getSkillName());
        skill.setDescription(skillDto.getDescription());

        Skill savedSkill = skillRepository.save(skill);
        return toDto(savedSkill);
    }

    @Override
    public SkillDto updateSkill(Long id, SkillDto skillDto){
        Skill skill = skillRepository.getSkillById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found with id: " + id));
        skill.setUserId(skillDto.getUserId());
        skill.setSkillName(skillDto.getSkillName());
        skill.setDescription(skillDto.getDescription());
        Skill updatedSkill = skillRepository.save(skill);
        return toDto(updatedSkill);
    }

    @Override
    public List<SkillDto> getAllSkillsByUserID(Long id){
        return skillRepository.getSkillsByUserId(id).stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public void deleteSkill(Long id) {
        Skill skill = skillRepository.getSkillById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found with id: " + id));
        skillRepository.delete(skill);
    }

    public SkillDto toDto(Skill skill) {
        SkillDto skillDto = new SkillDto();
        skillDto.setId(skill.getId());
        skillDto.setUserId(skill.getUserId());
        skillDto.setSkillName(skill.getSkillName());
        skillDto.setDescription(skill.getDescription());
        return skillDto;
    }

}