package com.example.exampleliqubase.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProfessorDTO {

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @NotNull
    private String middlename;

    @NotNull
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
}
