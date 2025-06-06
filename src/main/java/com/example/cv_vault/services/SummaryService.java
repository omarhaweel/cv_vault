package com.example.cv_vault.services;


import com.example.cv_vault.dtos.SummaryDto;

public interface SummaryService {
    SummaryDto createSummary(SummaryDto summaryDto);
    SummaryDto updateSummary(Long id, SummaryDto summaryDto);
    void deleteSummary(Long id);
}