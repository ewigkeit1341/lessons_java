package org.example._2024_05_22;
// создание методов
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world"); // сщздание класса main
        print(10, "Stringg"); //вызов и запуск другого класса в классе main
        int result = sum(15, 5);
        System.out.println("Sum result: " + result);

    }


    public static void print(int num, String name) {
        System.out.println("Hello from print"); // создание класса print в классе main
        System.out.println(num + " " + name);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    } // int - метод, который возвращает
      // void - метод, который ничего не возвращает




}


