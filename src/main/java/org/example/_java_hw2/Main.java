package org.example._java_hw2;


import org.example._2024_05_23.Student;

public class Main {
    public static void main(String[] args) {
        Concatenation say = new Concatenation(10, "people", "in", "home");
        System.out.println(say.getNum() + " " + say.getPeople() + " " + say.getIn() + " " + say.getHome());
    }
}
//подскажите, почему у меня перепутаны значения people и home? я вроде все делала по аналогии....
