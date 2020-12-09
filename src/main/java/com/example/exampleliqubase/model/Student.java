package com.example.exampleliqubase.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "student_entity")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long studentId;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "middlename")
    private String middlename;
    @Column(name = "specialty")
    private String specialty;
    @Column(name = "course")
    private int course;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "student_entity")
    private Set<Professor> professors;

    public Set<Professor> getProfessors() {
        return professors;
    }

    public void setBooks(Set<Professor> professors) {
        this.professors = professors;
    }


}
