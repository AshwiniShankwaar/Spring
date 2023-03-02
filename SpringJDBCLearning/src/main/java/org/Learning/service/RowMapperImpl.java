package org.Learning.service;

import org.Learning.entity.StudentData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class RowMapperImpl implements RowMapper<StudentData> {
    @Override
    public StudentData mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentData studentData = new StudentData();
        studentData.setRollNumber(rs.getInt(1));
        studentData.setName(rs.getString(2));
        studentData.setClassAndSection(rs.getString(3));

        return studentData;
    }
}
