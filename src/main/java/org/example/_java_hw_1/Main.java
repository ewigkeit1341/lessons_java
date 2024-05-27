package org.example._java_hw_1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//№ 1
//Создайте строку через new - I study Basic Java!
//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
        String myStr = new String("I study Basic Java!");
        System.out.println("Навероное так: " + myStr.toLowerCase());
        System.out.println("С учётом восклицательного знака - " + myStr.charAt(16));
        System.out.println(myStr.contains("Java"));
        System.out.println("Вырезать c помощью метода String.substring()??? - " + myStr.substring(14, 18));
        System.out.println(myStr.replace('a', 'o'));
        System.out.println("верхний регистр " + myStr.toLowerCase());
        System.out.println("нижний регистр " + myStr.toUpperCase());
    }
}

