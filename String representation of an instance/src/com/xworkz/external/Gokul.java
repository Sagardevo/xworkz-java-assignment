package com.xworkz.external;

import com.xworkz.internal.Student;

public class Gokul extends Student {
    private String name;
    private int age ;
    private char grade;
    public Gokul(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 4521;
    }
    @Override
    public String toString() {
        return "Gokul{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
