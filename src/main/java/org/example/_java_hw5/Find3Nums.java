package org.example._java_hw5;

import java.util.Scanner;
//Реализуйте программу, которая попросит пользователя ввести три
// целых числа (используйте сканер) и напечатает максимум из трех чисел.

public class Find3Nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int max = findMax(num1, num2, num3);
        System.out.println("Максимальное из введенных чисел: " + max);
    }

    public static int findMax ( int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

}
