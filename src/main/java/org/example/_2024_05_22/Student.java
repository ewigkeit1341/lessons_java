package org.example._2024_05_22;

public class Student {
    String name;
    int age;
    String group;


    //    default constructor
    public Student(){}


    //    constructor with name param
    public Student(String name) {
        this.name = name;
    }

    //    constructor with all params
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }
}
