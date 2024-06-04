package org.example._2024_05_31;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String str1 = scanner.nextLine();

//        System.out.println(getCharNums(str1)); //к решению задачи 1
        System.out.println(getSymbols(str1)); // к решению 2й задачи
    }

    //Задача 1 - Дана строка. Показать номера символов,
    // совпадающих с последним символом строки.
    public static String getCharNums(String string){
        char lastElement = string.charAt(string.length()-1);
        String insexesOfElemts = "";
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == lastElement) {
                insexesOfElemts = insexesOfElemts + i;
            }
        }
        return insexesOfElemts;
    }

    //Задача 2 - Дана строка. Показать третий, шестой, девятый и так далее символы.
public static String getSymbols(String string){
        String storageStr = "";
        for (int i = 2; i<=string.length(); i+=3){
            storageStr = storageStr + string.charAt(i);
        }
        return storageStr;
}

}
