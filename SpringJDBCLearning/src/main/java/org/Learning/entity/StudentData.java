package org.Learning.entity;

public class StudentData {
    public StudentData() {
        super();
    }

    private int rollNumber;
    private String Name;
    private String classAndSection;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", Name='" + Name + '\'' +
                ", classAndSection='" + classAndSection + '\'' +
                '}';
    }

    public StudentData(int rollNumber, String name, String classAndSection) {
        this.rollNumber = rollNumber;
        Name = name;
        this.classAndSection = classAndSection;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClassAndSection() {
        return classAndSection;
    }

    public void setClassAndSection(String classAndSection) {
        this.classAndSection = classAndSection;
    }
}
