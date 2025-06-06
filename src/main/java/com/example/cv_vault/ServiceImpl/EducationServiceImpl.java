package com.example.cv_vault.ServiceImpl;


import com.example.cv_vault.dtos.EducationDto;
import com.example.cv_vault.entities.Education;
import com.example.cv_vault.repositories.EducationRepository;
import com.example.cv_vault.services.EducationService;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class EducationServiceImpl implements EducationService {
    private final EducationRepository educationRepository;

    public EducationServiceImpl(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @Override
    public EducationDto getEducationById(Long id) {
        return educationRepository.getEducationById(id)
                .map(this::toDto)
                .orElseThrow(() -> new RuntimeException("Education not found with id: " + id));
    }

    @Override
    public EducationDto createEducation(EducationDto educationDto) {
        Education education = new Education();
        education.setUserId(educationDto.getUserId());
        education.setStartDate(educationDto.getStartDate());
        education.setEndDate(educationDto.getEndDate());
        education.setGrade(educationDto.getGrade());
        education.setSchoolName(educationDto.getSchoolName());
        education.setDescription(educationDto.getDescription());

        Education savedEducation = educationRepository.save(education);
        return toDto(savedEducation);
    }

    @Override
    public EducationDto updateEducation(Long id, EducationDto educationDto) {
        Education education = educationRepository.getEducationById(id)
                .orElseThrow(() -> new RuntimeException("Education not found with id: " + id));
        education.setUserId(educationDto.getUserId());
        education.setStartDate(educationDto.getStartDate());
        education.setEndDate(educationDto.getEndDate());
        education.setGrade(educationDto.getGrade());
        education.setSchoolName(educationDto.getSchoolName());
        education.setDescription(educationDto.getDescription());

        Education updatedEducation = educationRepository.save(education);
        return toDto(updatedEducation);
    }

    @Override
    public void deleteEducation(Long id) {
        Education education = educationRepository.getEducationById(id)
                .orElseThrow(() -> new RuntimeException("Education not found with id: " + id));
        educationRepository.delete(education);
    }

    @Override
    public List<EducationDto> findByUser_Id(Long userId) {
        return educationRepository.findByUser_Id(userId)
                .stream()
                .map(this::toDto)
                .collect(toList());
    }

    public EducationDto toDto(Education education) {
        EducationDto educationDto = new EducationDto();
        educationDto.setId(education.getId());
        educationDto.setUserId(education.getUserId());
        educationDto.setStartDate(education.getStartDate());
        educationDto.setEndDate(education.getEndDate());
        educationDto.setGrade(education.getGrade());
        educationDto.setSchoolName(education.getSchoolName());
        educationDto.setDescription(education.getDescription());
        return educationDto;

    }
}