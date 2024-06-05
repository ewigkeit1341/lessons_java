package org.example._2024_06_05;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // факториал числа
        //1! =  1
        //2! =  1 * 2 = 2
        //3! =  1 * 2 * 3 = 6
        //4! =  1 * 2 * 3 * 4 = 24
        //5! =  1 * 2 * 3 * 4 * 5  = 120
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number  ");
        int num = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++){
        result = i * result;
        }
        System.out.println("Result " + result);
    }
}
