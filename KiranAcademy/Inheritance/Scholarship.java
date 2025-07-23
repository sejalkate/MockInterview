package com.interview;

public class Scholarship extends Student
{
	public Scholarship(String name,String address,int rollNo,double marks) 
	{
        super(name,address,rollNo,marks);
    }
    public void checkScholarship() 
    {
        System.out.println("------ Student Details ------");
        System.out.println("Name: " +name);
        System.out.println("Address: " +address);
        System.out.println("Roll No: " +rollNo);
        System.out.println("Marks: " +marks);
        if(marks>80) 
        {
            System.out.println("Your are eligible for scholarship");
        } 
        else 
        {
            System.out.println("You are not eligible for scholarship");
        }
    }
}
