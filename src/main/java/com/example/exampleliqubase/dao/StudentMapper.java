package com.example.exampleliqubase.dao;

import com.example.exampleliqubase.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    @Insert("insert into student_entity (firstname, lastname, middlename, specialty, course) " +
            "values (#{firstname}, #{lastname} ,#{middlename} ,#{specialty}, #{course})")
    void save(Student student);

    @Update("update student_entity set firstname=#{firstname}, " +
            "lastname=#{lastname}, middlename=#{middlename}, " +
            "specialty=#{specialty}, course=#{course} where studentId=#{studentId}")
    void update(Student student);

    @Select("select * from student_entity")
    List<Student> getListStudents();

    @Select("select * from student_entity where student_id=#{studentId}")
    Student getStudentById(int studentId);

    @Delete("delete from student_entity where student_id=#{studentId}")
    void delete(int studentId);
}
