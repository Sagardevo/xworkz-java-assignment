package com.xworkz.external;

import com.xworkz.internal.Student;

public class Bharathwaj extends Student {
    private String name;
    private int age ;
    private char grade;
    public Bharathwaj(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 270;
    }
    @Override
    public String toString() {
        return "Arun{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
