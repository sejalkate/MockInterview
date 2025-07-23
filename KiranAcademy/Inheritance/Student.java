package com.interview;

public class Student extends Person
{
	int rollNo;
    double marks;
    
    public Student(String name,String address,int rollNo,double marks)
    {
        super(name,address);
        this.rollNo=rollNo;
        this.marks=marks;
    }
}
