package org.Learning.service;

import org.Learning.entity.StudentData;

import java.util.List;

public interface StudentDao {
    public int insert(StudentData studentData);
    public int update(StudentData studentData);
    public int delect(int rollno);
    public StudentData getStudentData(int rollno);
    public List<StudentData> getStudentList();
}
