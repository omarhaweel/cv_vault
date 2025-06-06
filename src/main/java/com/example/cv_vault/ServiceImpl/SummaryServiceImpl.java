package com.example.cv_vault.ServiceImpl;


import com.example.cv_vault.dtos.SummaryDto;
import com.example.cv_vault.entities.Summary;
import com.example.cv_vault.repositories.SummaryRepository;
import com.example.cv_vault.services.SummaryService;
import org.springframework.stereotype.Service;

@Service
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    public SummaryServiceImpl(SummaryRepository summaryRepository) {
        this.summaryRepository = summaryRepository;
    }

    @Override
    public SummaryDto createSummary(SummaryDto summaryDto) {
        Summary summary = new Summary();
        summary.setUserId(summaryDto.getUserId());
        summary.setSummaryText(summaryDto.getSummaryText());
        summaryRepository.save(summary);
        return toDto(summary);
    }

    @Override
    public SummaryDto updateSummary(Long id, SummaryDto summaryDto) {
        Summary summary = summaryRepository.getSummaryById(id)
                .orElseThrow(() -> new RuntimeException("Summary not found with id: " + id));
        summary.setUserId(summaryDto.getUserId());
        summary.setSummaryText(summaryDto.getSummaryText());
        summaryRepository.save(summary);
        return toDto(summary);
    }

    @Override
    public void deleteSummary(Long id) {
        Summary sumamry = summaryRepository.getSummaryById(id)
                .orElseThrow(() -> new RuntimeException("Summary not found with id: " + id));
        summaryRepository.delete(sumamry);
    }













    private SummaryDto toDto(Summary summary) {
        SummaryDto summaryDto = new SummaryDto();
        summaryDto.setId(summary.getId());
        summaryDto.setUserId(summary.getUserId());
        summaryDto.setSummaryText(summary.getSummaryText());
        return summaryDto;
    }

}