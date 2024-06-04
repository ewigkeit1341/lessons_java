package org.example._2024_06_04;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        //Последовательность Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int num1 = 1;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= count; i++){
            num3 = num1 + num2;
            System.out.print(num3 + " ");
                if (i % 15 == 0){
                    System.out.println();
                }
                num1 = num2;
                num2 = num3;
        }
    }
}
