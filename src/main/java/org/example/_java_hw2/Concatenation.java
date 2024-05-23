package org.example._java_hw2;
//1. не поняла как это сделать программно. Могу вручную на бумаге.
//2.Создайте класс Concatenation
//Создайте две переменные типа String
//Примените конкатенацию строк и выведите результат в консоль.
//Скомпилируйте созданную программу.
//Запустите программу в терминале.


import org.example._2024_05_23.Student;

public class Concatenation {
    private int num;
    private String people;
    private String in;
    private String home;

    public Concatenation(int num, String home, String in, String people){
            this.num = num;
            this.people = people;
            this.in = in;
            this.home = home;
        }

    public int getNum (){
        return this.num;
    }
    public String getPeople (){
        return this.people;
    }
    public String getIn (){
        return this.in;
    }
    public String getHome (){
        return this.home;
    }

}
