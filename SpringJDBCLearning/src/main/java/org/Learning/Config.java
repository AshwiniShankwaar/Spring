package org.Learning;

import org.Learning.entity.StudentData;
import org.Learning.service.StudentDao;
import org.Learning.service.StudentDataImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.Learning.service"})
public class Config {
    @Bean("dataSource")
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("system");
        ds.setPassword("system");
        return ds;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }
    @Bean("student")
    public StudentData getStudentData(){
        return new StudentData();
    }
//    @Bean("studentDao")
//    public StudentDataImpl getStudentDataImpl(){
//        StudentDataImpl studentDao = new StudentDataImpl();
//        studentDao.setJdbcTemplate(getJdbcTemplate());
//        return studentDao;
//    }
}
