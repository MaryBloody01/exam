package com.example.exampleliqubase.service;

import com.example.exampleliqubase.dto.StudentDTO;
import com.example.exampleliqubase.model.Student;

import java.util.List;

public interface StudentService {
    StudentDTO save(StudentDTO studentDTO);

    List<Student> getListStudents();

    Student getStudentById(int studentId);

    StudentDTO update(StudentDTO studentDTO);

    void delete(int studentId);
}