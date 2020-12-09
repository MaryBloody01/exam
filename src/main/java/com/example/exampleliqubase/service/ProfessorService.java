package com.example.exampleliqubase.service;

import com.example.exampleliqubase.dto.ProfessorDTO;
import com.example.exampleliqubase.model.Professor;

import java.util.List;

public interface ProfessorService {
    ProfessorDTO save(ProfessorDTO professorDTO);

    List<Professor> getListProfessors();

    Professor getProfessorById(int professorId);

    ProfessorDTO update(ProfessorDTO professorDTO);

    void delete(int professorId);
}