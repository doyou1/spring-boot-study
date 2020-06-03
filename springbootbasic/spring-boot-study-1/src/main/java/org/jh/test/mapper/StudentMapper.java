package org.jh.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jh.test.vo.Student;

import java.util.ArrayList;

@Mapper
public interface StudentMapper {

    public ArrayList<Student> getStudents();
    public Student getStudentByCode(String code);
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int id);

}
