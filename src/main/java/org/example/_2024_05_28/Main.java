package org.example._2024_05_28;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Original value: " + num);
        System.out.println("Convert value: " + (-num));
        num++; // постиннкремент
        num = ++num; //прединкремент
        System.out.println("Increment: " + num);

        int num1 = num;
        System.out.println("num1 = " + --num);


        // постинкремент
        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        // прединкремент
        for (int i = 0; i < 5; ++i){
            System.out.println("i = " + i);
        }








    }
}
