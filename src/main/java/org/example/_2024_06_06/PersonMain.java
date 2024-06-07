package org.example._2024_06_06;

public class PersonMain {
    public static void main(String[] args) {
        //дл сравнения equals
        Person ivan = new Person("Ivan");
        Person petr = new Person("Peter");
        Object vasya = new Object();
        String str = new String();

        System.out.println(ivan.equals(petr));
        System.out.println(ivan.equals(vasya));
        System.out.println(ivan.equals(str));
    }
}
