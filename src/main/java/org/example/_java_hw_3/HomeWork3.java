package org.example._java_hw_3;
//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.
public class HomeWork3 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int sum = add(num1, num2);

        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        int quotient = divide(num1, num2);


        System.out.println("Плюс: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Минус: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Умножить: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Делить: " + num1 + " / " + num2 + " = " + quotient);
    }

   public static int add(int a, int b) {
        return a + b;
    }
   public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
   public static int divide(int a, int b) {
        return a / b;
    }
}