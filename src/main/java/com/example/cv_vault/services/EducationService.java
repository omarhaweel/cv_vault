package com.example.cv_vault.services;


import com.example.cv_vault.dtos.EducationDto;

import java.util.List;

public interface EducationService {

    EducationDto getEducationById(Long id);
    EducationDto createEducation(EducationDto educationDto);
    EducationDto updateEducation(Long id, EducationDto educationDto);
    void deleteEducation(Long id);
    List<EducationDto> findEducationsByUserId(Long userId);
}