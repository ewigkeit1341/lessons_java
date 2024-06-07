package org.example._java_hw_7;
import java.util.Arrays;
import java.util.Random;
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.
public class Maniputation {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(50);
        }

        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("Измененный массив:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
