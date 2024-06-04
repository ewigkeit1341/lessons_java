package org.example._2024_05_28;

import java.util.Random;
import java.util.Scanner;

public class RelationOperationClass {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input start value(min 0):");
//        int startFirst = sc.nextInt();
//        System.out.println("Input end value(max 10):");
//        int endFirst = sc.nextInt();
//        System.out.println("Input start value(min 5):");
//        int startSecond = sc.nextInt();
//        System.out.println("Input end value(max 15):");
//        int endSecond = sc.nextInt();
//        Random random = new Random();
//        int value = random.nextInt(startFirst-10, endSecond + 10);
//        System.out.println("Random point is " + value);
//        boolean result = (value >= startFirst && value <= endFirst) ||
//                (value >= startSecond && value <= endSecond);
////        System.out.println("Is our array contain " + value + ": " + result);
//        System.out.println("Is our arrays contain " + value + ": " + result);



        System.out.println(isTrueFalse());
// ИЛИ ТАКОЕ БОЛЕЕ ОПТИМАЛЬНОЕ РЕШЕНИЕ:
//        int a = 7;
//        int b = 105;
//        int c = 314;
//        int d =54;
//        System.out.println(isTrueFalse(a, b, c, d));

    }



//================================
//        Создайте переменные int a, b, c, d;
//        Используя блок if (выражение) {}, составьте логические выражения
//        истина , если “а” меньше “b” И “b” равно “c”;
//        истина , если “а” больше “b” ИЛИ “c” равно “d”;
//        истина , если “а” НЕ равно “b”;

    public static boolean isTrueFalse () {
    int a = 2;
    int b = 3;
    int c = 4;
    int d = 5;
    if (a < b && b == c) {
        return true;
    }
    if (a > b || c == d) {
        return true;
    }
    if (a != b) {
        return true;
    }
    return false;

// ИЛИ ТАКОЕ БОЛЕЕ ОПТИМАЛЬНОЕ РЕШЕНИЕ:
//        public static boolean isTrueFalse (int a, int b, int c, int d ) {
//
//            if (a<b && b==c) {
//                return true;
//            }
//            if (a>b || c==d) {
//                return true;
//            }
//            if ( a!=b){
//                return true;
//            }
//            return false;
//        }
//    }
}
}
