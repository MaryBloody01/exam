package com.example.exampleliqubase.dao;

import java.util.List;

import com.example.exampleliqubase.model.Professor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProfessorMapper {

    @Insert("insert into professor_entity (firstname, lastname, middlename, department) " +
            "values (#{firstname}, #{lastname} ,#{middlename} ,#{department} )")
    void save(Professor professor);

    @Update("update professor_entity set firstname=#{firstname}, " +
            "lastname=#{lastname}, middlename=#{middlename}, " +
            "department=#{department} where professorId=#{professorId}")
    void update(Professor professor);

    @Select("select * from professor_entity")
    List<Professor> getListProfessors();

    @Select("select * from professor_entity where professor_id=#{professorId}")
    Professor getProfessorById(int professorId);

    @Delete("delete from professor_entity where professor_id=#{professorId}")
    void delete(int professorId);
}

