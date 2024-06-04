//package org.example._2024_05_27;
//
//import java.util.Random;
//import java.util.Scanner;
//
////public class Main {
////    public static void main(String[] args) {
//////        findEvenOdd(2);
////        findEvenOdd(4);
////        findEvenOdd(5);
//        Double nums = devideTwoNums(9, 0);
//        if (nums != null) {
//            System.out.println("Result - " + nums);
//        }
//
//
////    ===================================================
//
//
//        // Сканер
//        Scanner scanner = new Scanner(System.in); // System - класс. in - ввод, out - вывод
//        System.out.println("Input value");
//        int num = scanner.nextInt(); //вводим число, можно в консоли, вывод числа
////        String num = scanner.nextLine(); //вывод всей ОДНОЙ строки
////        String num = scanner.next.nextLine(); //вывод построчно всего
////        ____ num = scanner.next_____-(); //какой тип введем, такой и выведем
//        System.out.println("Your input is " + num);
//
//
////    ==================================================
////    public static void findEvenOdd(int num){
////        if (num % 2 == 0){
////            System.out.println(num+" is even"); }
////        else {
////            System.out.println(num+" is odd"); }
////    }
//
////======================================================
//
//    public static Double devideTwoNums (double a, double b){
//        if (b == 0){
//            System.out.println("Delim na null");
//                return null;
//        }else{
//            return a / b;
//        }
//
//    }
//
////===================================================
////Напишите программу на Java для того, чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной:
////
////На вход: а = 2; b = 5;
////На выход: a = 5; b = 2;
////Используйте переменную temp;
//
//        int a = 2;
//        int b = 5;
//        System.out.println("Начальные значения: a = " + a + ", b = " + b);
//        a = b + a;
//        b = a - b;
//        a = a - b;
//        System.out.println("Новые: a = " + a + ", b = " + b);
//
//
//
//
////======================================
////Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
////Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
////        Например: 
////ввод - mama, papa 
////вывод - mapa


//import java.util.Scanner;
//
//Scanner scanner = new Scanner(System.in);
//        String wordOne = scanner.nextLine();
//        String wordTwo = scanner.nextLine();
//
//        if ((wordOne.length() + wordTwo.length()) % 2 != 0) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        System.out.println((wordOne.substring(0, wordOne.length()/2)) + (wordTwo.substring(wordTwo.length()/2)));
//    }
//
//}