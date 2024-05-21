package org.example._2024_05_21;

import java.util.Objects;

public class StringClassExample {
    public static void main(String[] args) {
        //методы:
        String str = "I learn Java";
        System.out.println("Length - " + str.length()); //длина строки
        System.out.println("Substring - " + str.substring(8, 10)); //какие буква на позициях 8 и 10
        System.out.println("charAt - " + str.charAt(2)); //2я буква
        System.out.println("After " + str.toLowerCase()); //маленькие буквы
        System.out.println("After " + str.toUpperCase()); //большие буквы
        System.out.println(str.indexOf("Java")); //найти по какому индексу находится слово
        String answer = "y";
        System.out.println(Objects.equals(answer.toLowerCase(),"y"));








    }
}
