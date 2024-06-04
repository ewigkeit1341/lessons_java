package org.example._2024_05_23._random;

import java.util.Random;

//Использование Random класса:
//Импортировать класс java.util.Random
//Создать экземпляр класса Random (Random rand = new Random())
//Вызовите один из следующих методов объекта rand:
//nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
//nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
//nextDouble() генерирует двойное число между 0.0 и 1.0.



public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt()); //генерация случайного НЕ заданного числа.
        System.out.println(random.nextInt(11)); // рандомное число ДО значения,
        // указанного в скобке. Если надо 10, то надо указать 11. Если 100, то указать 101.
        System.out.println(random.nextFloat()); // рандомное число с плавающей запятой от 0.0 и 1.0
        System.out.println(random.nextDouble());// рандомное число с двойной точностью между 0.0 и 1.0
    }









}
