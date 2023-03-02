package org.Learning;

import org.Learning.entity.StudentData;
import org.Learning.service.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("project started");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        //not a recommended way
//        JdbcTemplate template = context.getBean(JdbcTemplate.class);
//        String query = "insert into StudentData(rollno,name,class) values(?,?,?)";
//        int result = template.update(query,1,"Ashwini","mca");
//        System.out.println(result + " data inserted");
        StudentData studentData = (StudentData)context.getBean("student");
        studentData.setName("Ashwini");
        studentData.setRollNumber(1);
        studentData.setClassAndSection("MCA");

        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
//        int result = studentDao.insert(studentData);
//        int result = studentDao.update(studentData);
//        int result = studentDao.delect(1);
//        StudentData studentData1 = studentDao.getStudentData(36);
        List<StudentData> data = studentDao.getStudentList();
        for (StudentData student: data) {
            System.out.println(student);
        }

    }
}