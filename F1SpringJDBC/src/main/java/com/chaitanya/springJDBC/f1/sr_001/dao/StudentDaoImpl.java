package com.chaitanya.springJDBC.f1.sr_001.dao;

import com.chaitanya.springJDBC.f1.sr_001.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "insert into student(id,name,city) values (?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int change(Student student) {
        String query = "update student set city=?,name=? where id=?";
        int r = this.jdbcTemplate.update(query, student.getCity(), student.getName(), student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        String query = "Delete from student where id=?";
        int r = this.jdbcTemplate.update(query, studentId);
        return r;
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
