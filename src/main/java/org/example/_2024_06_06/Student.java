package org.example._2024_06_06;
//Написать класс Student, у которого есть свойства -
// name, age, group. Описать несколько конструкторов,
// если не будет конструктора со всеми параметрами,
// то создать set методы для полей, создать get методы. Классе  Main создать несколько студентов на основании созданных конструкторов.
public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }
    public String toString () {// метод превращает объект в строку
        return name + " is " + age + " years old and is in IT-Group " + group;
    }
}
