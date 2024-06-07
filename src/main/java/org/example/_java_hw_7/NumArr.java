package org.example._java_hw_7;
import java.util.Arrays;
import java.util.Random;
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.
public class NumArr {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90);
        }

        System.out.println("Массив:");
        printArray(array);

        boolean isStrictlyIncreasing = isArrayStrictlyIncreasing(array);

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean isArrayStrictlyIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
