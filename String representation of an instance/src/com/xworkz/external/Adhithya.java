package com.xworkz.external;

import com.xworkz.internal.Student;

public class Adhithya extends Student {
    private String name;
    private int age ;
    private char grade;
    public Adhithya(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 100;
    }
    @Override
    public String toString() {
        return "Adhithya{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
