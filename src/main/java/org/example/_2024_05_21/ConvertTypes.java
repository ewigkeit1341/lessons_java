package org.example._2024_05_21;

public class ConvertTypes {
    public static void main(String[] args) {
        int i = 127;
        System.out.println(i); // явное преобразование

        byte b = (byte)128;
        System.out.println(b); //неявное преобразование
        // -128 .. 127

        //Создать новую строку: “I study Java”
        //Вывести в консоль длину строки
        //Вывести в консоль часть строки “Java” используя substring


        String str = "I study Java";
        System.out.println("Length - " + str.length());
        System.out.println("Substring - " + str.substring(8));
    }
}
