package com.example.cv_vault.controllers;

import com.example.cv_vault.ServiceImpl.SummaryServiceImpl;
import com.example.cv_vault.services.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/summary")
public class SummaryController {

    @Autowired
    private final SummaryServiceImpl summaryService;

    public SummaryController(SummaryServiceImpl summaryService) {
        this.summaryService = summaryService;
    }




}
