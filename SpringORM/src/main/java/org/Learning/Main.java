package org.Learning;

import java.util.List;

import org.Learning.dao.StudentDao;
import org.Learning.dao.StudentDaoImpl;
import org.Learning.entity.StudentDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = (StudentDao) context.getBean("StudentDoImplementation");
        StudentDetails studentDetails = new StudentDetails(12,"Ashwini kumar","MCA");
        //int r = studentDao.insert(studentDetails);
       // studentDao.delete(12);
        studentDao.update(studentDetails);
        List<StudentDetails> list = studentDao.getStudent();
        for(StudentDetails s: list) {
        	System.out.println(s.toString());
        }
//        StudentDetails studentDetail = studentDao.getDetails(2170036);

    }
}