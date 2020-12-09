package com.example.exampleliqubase.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "professor_entity")
public class Professor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long professorId;

    private String firstname;

    private String lastname;

    private String middlename;

    private String faculty;

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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    public Long getProfessorId() {
        return professorId;
    }

    @ManyToMany
    @JoinTable(name="students_professors",
            joinColumns = @JoinColumn(name="professor_id", referencedColumnName="student_id"),
            inverseJoinColumns = @JoinColumn(name="student_id", referencedColumnName="professor_id")
    )
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}
