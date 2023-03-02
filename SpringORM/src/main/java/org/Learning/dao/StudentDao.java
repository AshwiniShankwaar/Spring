package org.Learning.dao;

import java.util.List;

import org.Learning.entity.StudentDetails;

public interface StudentDao {
    public int insert(StudentDetails studentDetails);
    public void update(StudentDetails studentDetails);
    public List<StudentDetails> getStudent();
    public StudentDetails getDetails(int rollno);
    public void delete(int rollno);

}
