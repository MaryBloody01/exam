package com.example.exampleliqubase.controller;

import com.example.exampleliqubase.dto.StudentDTO;
import com.example.exampleliqubase.model.Student;
import com.example.exampleliqubase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public StudentDTO save(@RequestBody @Validated StudentDTO studentDTO) {
        return studentService.save(studentDTO);
    }

    @PostMapping("/update")
    public StudentDTO update(@RequestBody @Validated StudentDTO studentDTO) {
        return studentService.update(studentDTO);
    }

    @GetMapping
    public List<Student> getListStudents() {
        return studentService.getListStudents();
    }

    @GetMapping("/byId")
    public Student getStudentById(@RequestParam @Validated int studentId) {
        return studentService.getStudentById(studentId);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam @Validated int studentId) {
        studentService.delete(studentId);
    }


}
