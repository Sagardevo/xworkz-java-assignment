package com.XWorkz.inheritence.Internal;

public class Arun extends Student{
    public Arun()
    {
        System.out.println("No args Arun Constructor");
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Name Arun");
    }
    @Override
    public void branch()
    {
        System.out.println("Student Branch ISE");
    }
    @Override
    public void USN()
    {
        System.out.println("Student USN 4JN21IS001");
    }
    @Override
    public void college()
    {
        System.out.println("Student College JNNCE");
    }
    @Override
    public void year()
    {
        System.out.println("Students Admission Year 2021");
    }
}
