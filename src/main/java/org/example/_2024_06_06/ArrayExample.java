package org.example._2024_06_06;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int [] arrInt = new int[10]; // инициализация массива 1
        int [] arrNewInt = { 1, 2, 3, 4, 10 }; // инициализация массива 2

        for (int i = 0; i < arrInt.length; i++) { // запус перебора элементов массива 1
            System.out.print(arrInt[i] + " "); // вывод содержимого массива 1 с циклом
        }
        System.out.println();
        System.out.println(Arrays.toString(arrInt)); // вывод содержимого массива 1

        for (int i = 0; i < arrNewInt.length; i++) {// запус перебора элементов массива 2
            System.out.print(arrNewInt[i] + " "); // вывод содержимого массива 2 с циклом
        }
        System.out.println();
        System.out.println(Arrays.toString(arrNewInt));// вывод содержимого массива 2

// или:
        for (int i = 0; i < arrNewInt.length; i++) {// запус перебора элементов массива 2
            System.out.println(i + " - " + arrNewInt[i]);// вывод содержимого массива 2 с циклом
        }
        System.out.println();
        System.out.println(Arrays.toString(arrNewInt));


//        arrInt[10] = 100; - нельзя увеличить или уменьшить массив
//        arrNewInt[10] = 100; - нельзя увеличить или уменьшить массив
    }
}
