package org.example._2024_05_28;

public class UnaryTest {
    public static void main(String[] args) {
//        Создайте класс UnaryTest
//        Создайте переменную с положительным знаком
//        Примените к переменной пост-инкремент и пост-декремент
//        Примените к переменной пре-инкремент и пре-декремент
//        Используя режим дебаггера проследите изменения

       int zn = 15;
       int post = zn++ + zn--;
       int pre = ++zn + --zn;

        System.out.println("Получится: " +post);
        System.out.println("Получится: " + pre);

//=======================================

//        Создайте три переменные
//        Сравните поочередно каждые из созданных переменных используя реляционные операторы
//        Результат распечатайте в консоль

        int a = 5;
        int b = 50;
        int c = 500;

        System.out.println("a == b " + (a == b));
        System.out.println("a != c " + (a != c));
        System.out.println("b == c " + (b == c));
        System.out.println("a < b " + (a < b));
        System.out.println("b > c " + (b > c));
        System.out.println("c >= b " + (c >= b));




    }
}
