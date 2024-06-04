package org.example._2024_05_23._random;
//    Использование Math.random
//    Объявить минимальное значение диапазона
//    Объявить максимальное значение диапазона
//    Используйте формулу Math.random()*(max-min+1)+min для создания
//    значений, включающих значение min и max
public class MathClass {
    public static void main(String[] args) {
        int min = 5;
        int max = 12;
        System.out.println((int) (Math.random()*(max-min+1)+min)); // с использованием int выводится целое число, без - double
        System.out.println(Math.random());
    }
}
