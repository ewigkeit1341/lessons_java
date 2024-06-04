package org.example._2024_05_31;

import java.util.Scanner;
//Написать программу калькулятор, которая через сканнер
// принимает 3 аргумента, первое число, знак оператора
// и второе число, и совершает над ними операцию,
// используя оператор switch. на экран вывести результат вычисления
public class Main {
    public static void main(String[] args) {
//Написать программу калькулятор, которая через сканнер принимает 3 аргумента, первое число,
// знак оператора и второе число, и совершает над ними операцию, используя оператор switch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double numFirst = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите знак действия + - * /");
        String lineUser = scanner.nextLine();
        if (lineUser.length() > 1) {
            System.out.println("Error");
            System.exit(0);
        }
//        if (num2 == 0 ) {
//            System.out.println("Ошибка деления на 0");
//            System.exit(0);
//        }
        char operator = lineUser.charAt(0);
        System.out.println("Введите второе число");
        double numSecond = scanner.nextDouble();
        System.out.println("Результат действия: " + calcNum(numFirst, numSecond, operator));
    }
    public static double calcNum(double num1, double num2, char operator) {
        double res = 0;
        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        return res;
    }
}
