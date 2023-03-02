package com.RedirectSpring.entity;

public class Student {
    private String Name;
    private int Rollno;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Rollno=" + Rollno +
                ", Branch='" + Branch + '\'' +
                ", Select='" + Select + '\'' +
                ", address=" + address.toString() +
                '}';
    }

    private String Branch;
    private String Select;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getSelect() {
        return Select;
    }

    public void setSelect(String select) {
        Select = select;
    }
}
