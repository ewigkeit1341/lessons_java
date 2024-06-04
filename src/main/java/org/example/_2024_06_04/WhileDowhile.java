package org.example._2024_06_04;

import java.util.Scanner;

public class WhileDowhile {
    public static void main(String[] args) {
//        int j = 0;
//        while (j < 3 ) {
//            System.out.println(j);
//            j++;
//        }
//        //        infinity loop
//        while (true) {
//            System.out.println("Hello");


        // Цикл while
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.println("Enter first number");
//            int a = sc.nextInt();
//            System.out.println("Enter second number");
//            int b = sc.nextInt();
//            System.out.println("Enter operation");
//            char oper = sc.next().charAt(0);
//            System.out.println(a + " " + oper + " " + b + " = " + (a + b));
//            System.out.println("Do you you want one more time?(Y/N)");
//            char answer = sc.next().charAt(0);
//            if (answer == 'N' || answer == 'n') {
//                    break;
//            }
//        }
//=============================================================//
        // Цикл do-while

        //Используйте цикл do-while
        //Инициализируйте переменную int i = 0;
        //Добавьте в тело инструкцию System.out.println("Я в теле DO");
        //Определите условие i < 3
        //Запустите код
        //Определите условие i < 0
        //Проанализируйте результат

//        int i = 0;
//        do {
//            //Задача 1
//            System.out.println("Я в теле DO. И буду там, пока i не будет больше 3. Сейчас i = " + i);
//            i++;
//        } while (i < 3);
//
//------------------
//        int x = 10;
//        int sum = 0;
//
//        do {
//            sum += x;
//            x--;
//        }
//        while (x > 10);
//        System.out.println(sum);

//-----------------
        //// Показать на экране равнобедренный треугольник (пользователь вводит
        //// высоту). Затем сделать то же самое, но чтоб фигура внутри была пустая
        //// (остаётся только контур).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value  ");
        int height = scanner.nextInt();
        int a = 0;
        int b = height - 1;
        int c = height + 1;


        for (int j = 0; j < height; j++) {
            for (int i = 0; i < 2 * height; i++) {
                if (j == a && i > b && i < c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.println();
        }




    }
}




