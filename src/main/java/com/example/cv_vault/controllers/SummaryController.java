package com.example.cv_vault.controllers;

import com.example.cv_vault.ServiceImpl.SummaryServiceImpl;
import com.example.cv_vault.dtos.SummaryDto;
import com.example.cv_vault.services.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/summary")
public class SummaryController {

    private final SummaryServiceImpl summaryService;

    public SummaryController(SummaryServiceImpl summaryService) {
        this.summaryService = summaryService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createSummary(SummaryDto summaryDto) {
        summaryService.createSummary(summaryDto);
        return ResponseEntity.ok("Summary created successfully");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateSummary(Long id, SummaryDto summaryDto) {
        summaryService.updateSummary(id, summaryDto);
        return ResponseEntity.ok("Summary updated successfully");
    }

    @PostMapping("/delete")
    public ResponseEntity<String> deleteSummary(Long id) {
        summaryService.deleteSummary(id);
        return ResponseEntity.ok("Summary deleted successfully");
    }

    @PostMapping("/get")
    public ResponseEntity<SummaryDto> getSummaryByUserId(Long userId) {
        SummaryDto summaryDto = summaryService.getSummaryByUserId(userId);
        return ResponseEntity.ok(summaryDto);
    }


}
