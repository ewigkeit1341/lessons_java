package org.example._2024_05_30;

public class TernaryOperator {
    public static void main(String[] args) {
        //Создать переменную int num, приносить ей любое значение и
        // проверить, делится ли она на 3 без остатка.
        // Проверку сделать с помощью if-else и с помощью тернарного оператора.

        int num = 55;

        if (num % 3 == 0){
            System.out.println("richtig");
        }else{
            System.out.println("falsch");
        }
    //--------------------или тернарным оператором--------------

        System.out.println(num % 3 == 0 ? "richtig" : "falsch");

//=========================================================================//




    }
}
