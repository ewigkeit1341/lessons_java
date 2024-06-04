package org.example._2024_05_30;

public class Main {
    public static void main(String[] args) {
        int num = 8;
        int num1 = 0;
        System.out.println("------------if-else-----------");
        if (num % 2 == 0) {
            num1 = 10;
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println(num1);
//

        String str = num < 10 ? printLessTen(num) : num < 12 ? "less then 12" : num < 20 ? "" : "";
        System.out.println(str);


    }


    public static String printLessTen(int num) {
        return "less then 10";
    }
}
