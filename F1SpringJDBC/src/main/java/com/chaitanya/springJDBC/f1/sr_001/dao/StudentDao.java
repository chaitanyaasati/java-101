package com.chaitanya.springJDBC.f1.sr_001.dao;

import com.chaitanya.springJDBC.f1.sr_001.entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
}
