package com.example.exampleliqubase.controller;

import com.example.exampleliqubase.dto.ProfessorDTO;
import com.example.exampleliqubase.dto.StudentDTO;
import com.example.exampleliqubase.model.Professor;
import com.example.exampleliqubase.model.Student;
import com.example.exampleliqubase.service.ProfessorService;
import com.example.exampleliqubase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping("/save")
    public ProfessorDTO save(@RequestBody @Validated ProfessorDTO professorDTO) {
        return professorService.save(professorDTO);
    }

    @PostMapping("/update")
    public ProfessorDTO update(@RequestBody @Validated ProfessorDTO professorDTO) {
        return professorService.update(professorDTO);
    }

    @GetMapping
    public List<Professor> getListProfessors() {
        return professorService.getListProfessors();
    }

    @GetMapping("byId")
    public Professor getProfessorById(@RequestParam @Validated int professorId) {
        return professorService.getProfessorById(professorId);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam @Validated int professorId) {
        professorService.delete(professorId);
    }


}
