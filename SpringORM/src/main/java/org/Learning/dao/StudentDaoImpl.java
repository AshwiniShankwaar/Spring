package org.Learning.dao;

import java.util.List;

import org.Learning.entity.StudentDetails;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDaoImpl implements StudentDao{


    HibernateTemplate hibernateTemplate;
    @Transactional(readOnly = false)
    @Override
    public int insert(StudentDetails studentDetails) {
        Integer i = (Integer) this.hibernateTemplate.save(studentDetails);
        return i;
    }
    
    public StudentDaoImpl() {
    }

    public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Transactional(readOnly = false)
	@Override
	public void update(StudentDetails studentDetails) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(studentDetails);
	}

	@Override
	public List<StudentDetails> getStudent() {
		// TODO Auto-generated method stub
		List<StudentDetails> listDetails = this.hibernateTemplate.loadAll(StudentDetails.class);
		return listDetails;
	}
	@Transactional(readOnly = false)
	@Override
	public void delete(int rollno) {
		// TODO Auto-generated method stub
		StudentDetails studentDetails = this.hibernateTemplate.get(StudentDetails.class, rollno);
		this.hibernateTemplate.delete(studentDetails);
	}

	@Override
	public StudentDetails getDetails(int rollno) {
		// TODO Auto-generated method stub
		StudentDetails student= this.hibernateTemplate.get(StudentDetails.class,rollno);
		return student;
	}
}
