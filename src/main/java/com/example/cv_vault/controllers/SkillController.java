package com.example.cv_vault.controllers;


import com.example.cv_vault.ServiceImpl.SkillServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skills")
public class SkillController {
    private final SkillServiceImpl skillService;

    public SkillController(SkillServiceImpl skillService) {
        this.skillService = skillService;
    }


}
