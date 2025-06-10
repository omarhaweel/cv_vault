package com.example.cv_vault.ServiceImpl;


import com.example.cv_vault.dtos.ExperienceDto;
import com.example.cv_vault.entities.Experience;
import com.example.cv_vault.repositories.ExperienceRepository;
import com.example.cv_vault.services.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImpl (ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public ExperienceDto createExperience(ExperienceDto experienceDto) {
        Experience experience = new Experience();
        return getExperienceDto(experienceDto, experience);
    }

    private ExperienceDto getExperienceDto(ExperienceDto experienceDto, Experience experience) {
        experience.setUserId(experienceDto.getUserId());
        experience.setStartDate(experienceDto.getStartDate());
        experience.setEndDate(experienceDto.getEndDate());
        experience.setJobTitle(experienceDto.getJobTitle());
        experience.setCompanyName(experienceDto.getCompanyName());
        experience.setDescription(experienceDto.getDescription());

        Experience savedExperience = experienceRepository.save(experience);
        return toDto(savedExperience);
    }

    @Override
    public ExperienceDto updateExperience(Long id, ExperienceDto experienceDto) {
        Experience experience = experienceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Experience not found with id: " + id));

        return getExperienceDto(experienceDto, experience);
    }

    @Override
    public void deleteExperience(Long id) {
        Experience experience = experienceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Experience not found with id: " + id));
        experienceRepository.delete(experience);
    }

    @Override
    public List<ExperienceDto> findExperiencesByUserId(Long userId) {
        return experienceRepository.findExperiencesByUserId(userId).stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public ExperienceDto toDto(Experience experience) {
        ExperienceDto experienceDto = new ExperienceDto();
        experienceDto.setId(experience.getId());
        experienceDto.setUserId(experience.getUserId());
        experienceDto.setStartDate(experience.getStartDate());
        experienceDto.setEndDate(experience.getEndDate());
        experienceDto.setJobTitle(experience.getJobTitle());
        experienceDto.setCompanyName(experience.getCompanyName());
        experienceDto.setDescription(experience.getDescription());
        return experienceDto;
    }
}