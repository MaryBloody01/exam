package com.example.exampleliqubase.service.api;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.example.exampleliqubase.dao.ProfessorMapper;
import com.example.exampleliqubase.dao.StudentMapper;
import com.example.exampleliqubase.dto.ProfessorDTO;
import com.example.exampleliqubase.dto.StudentDTO;
import com.example.exampleliqubase.model.Professor;

import com.example.exampleliqubase.model.Student;
import com.example.exampleliqubase.service.ProfessorService;
import com.example.exampleliqubase.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DataSource dataSource;

    @Override
    @Transactional
    public StudentDTO save(StudentDTO studentDTO) {

        Student student = modelMapper.map(studentDTO, Student.class);
        studentMapper.save(student);

        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    @Transactional
    public StudentDTO update(StudentDTO studentDTO) {

        Student student = modelMapper.map(studentDTO, Student.class);
        studentMapper.save(student);

        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public void delete(int studentId) {
        studentMapper.delete(studentId);
    }

    @Override
    public List<Student> getListStudents() {
        return studentMapper.getListStudents();
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentMapper.getStudentById(studentId);
    }
}

