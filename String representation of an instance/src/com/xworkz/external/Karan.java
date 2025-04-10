package com.xworkz.external;

import com.xworkz.internal.Student;

public class Karan extends Student {
    private String name;
    private int age ;
    private char grade;
    public Karan(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 2054;
    }
    @Override
    public String toString() {
        return "Karan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
