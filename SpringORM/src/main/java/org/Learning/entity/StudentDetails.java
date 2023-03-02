package org.Learning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentData")
public class StudentDetails {
	
   

	@Id
    @Column(name = "rollno")
    private int rollno;
    @Column(name="name")
    private String name;
    @Column(name = "class")
    private String classAndSection;

    public StudentDetails() {
    }

    public StudentDetails(int rollno, String name, String classAndSection) {
        this.rollno = rollno;
        this.name = name;
        this.classAndSection = classAndSection;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassAndSection() {
        return classAndSection;
    }

    public void setClassAndSection(String classAndSection) {
        this.classAndSection = classAndSection;
    }
    @Override
   	public String toString() {
   		// TODO Auto-generated method stub
    	String s = this.rollno+" "+this.name+" is of class "+this.classAndSection;
   		return s;
   	}
}
