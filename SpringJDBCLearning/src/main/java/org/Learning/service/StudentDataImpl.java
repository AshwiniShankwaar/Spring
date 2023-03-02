package org.Learning.service;

import org.Learning.entity.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("studentDao")
public class StudentDataImpl implements StudentDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(StudentData studentData) {
        String query = "insert into StudentData(rollno,name,class) values(?,?,?)";
        int result = jdbcTemplate.update(
                query,
                studentData.getRollNumber(),
                studentData.getName(),
                studentData.getClassAndSection());
        return result;
    }

    @Override
    public int update(StudentData studentData) {
        String query = "update StudentData set class = ? where rollno =? ";
        int result = jdbcTemplate.update(query,studentData.getClassAndSection(),studentData.getRollNumber());
        return result;
    }

    @Override
    public int delect(int rollno) {
        String query = "delete from StudentData where rollno = ?";
        int result = jdbcTemplate.update(query,rollno);
        return result;
    }

    @Override
    public StudentData getStudentData(int rollno) {
        String query = "Select * from StudentData where rollno = ?";
        RowMapperImpl rowMapper = new RowMapperImpl();
        StudentData studentData = this.jdbcTemplate.queryForObject(query,rowMapper,rollno);
        return studentData;
    }

    @Override
    public List<StudentData> getStudentList() {
        String query = "Select * from StudentData";
        List<StudentData> data = this.jdbcTemplate.query(query,new RowMapperImpl());
        return data;
    }
}
