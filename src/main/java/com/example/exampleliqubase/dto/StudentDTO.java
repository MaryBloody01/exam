package com.example.exampleliqubase.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class StudentDTO {

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @NotNull
    private String middlename;

    @NotNull
    private String specialty;

    @NotNull
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
}
