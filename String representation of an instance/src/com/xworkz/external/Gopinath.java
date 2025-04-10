package com.xworkz.external;

import com.xworkz.internal.Student;

public class Gopinath extends Student {
    private String name;
    private int age ;
    private char grade;
    public Gopinath(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 732;
    }
    @Override
    public String toString() {
        return "Gopinath{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
