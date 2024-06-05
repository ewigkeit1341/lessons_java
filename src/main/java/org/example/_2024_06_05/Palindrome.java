package org.example._2024_06_05;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    // Определить, является ли введённое число любой разрядности палиндромом
    //(например, 1234321 – палиндром, 12345 – не палиндром).
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число");
        String number= scanner.next();
        boolean flag= false ;
        for (int i =0; i<= number.length()/2; i++){
            if ( number.charAt(i)==number.charAt(number.length()-i-1)) {
                flag=true;
            }
            else flag=false;
        }
        String res = flag ? "is a palindrome" : "isn't a palindrome";
        System.out.println(res);
    }
//ИЛИ
    public static boolean isStrPol(String str) {
        StringBuilder sb = new StringBuilder(str);
        return Objects.equals(str, sb.reverse().toString());
    }
// ИЛИ

    public static boolean isPalindrome(int num) {
        int r,sum=0,temp;

        temp=num;
        while(num > 0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        return temp==sum;
    }


}
