package com.example.exampleliqubase.service.api;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.example.exampleliqubase.dao.ProfessorMapper;
import com.example.exampleliqubase.dto.ProfessorDTO;
import com.example.exampleliqubase.model.Professor;

import com.example.exampleliqubase.service.ProfessorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorMapper professorMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        System.out.println();
    }

    @Override
    @Transactional
    public ProfessorDTO save(ProfessorDTO professorDTO) {

        Professor professor = modelMapper.map(professorDTO, Professor.class);
        professorMapper.save(professor);

        return modelMapper.map(professor, ProfessorDTO.class);
    }

    @Override
    @Transactional
    public ProfessorDTO update(ProfessorDTO professorDTO) {

        Professor professor = modelMapper.map(professorDTO, Professor.class);
        professorMapper.save(professor);

        return modelMapper.map(professor, ProfessorDTO.class);
    }

    @Override
    public void delete(int professorId) {
        professorMapper.delete(professorId);
    }

    @Override
    public List<Professor> getListProfessors() {
        return professorMapper.getListProfessors();

//
//                .stream()
//                .map(professor -> modelMapper.map(professor, Professor.class))
//                .collect(Collectors.toList());
    }

    @Override
    public Professor getProfessorById(int professorId) {
       return professorMapper.getProfessorById(professorId);
    }

}

