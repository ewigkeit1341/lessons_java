package org.example._2024_05_21;

public class CharacterClassExample {
    public static void main(String[] args) {
        // Преобразование char в int ( см таблицу кодировки UTF-16. Использовать таблицу ASCII:
        //с маленькой буквы

//        char ch = 'A'; // объявление переменной с значением А
//        System.out.println(ch + " " + (int)ch); // вывод переменной ch с преобразованием в int
//        System.out.println((char)97); // преобразование из char в int

//=================================

        int numASCII = 'a'; //вывод по умочанию в ASCII
        int numVueOf = Integer.valueOf('A'); // мы хотим получить числовое значение переменной 'A'. Методом valueOf
        int numNumericValue = Character.getNumericValue('A'); // вывод через метод getNumericValue

        System.out.println(numASCII);
        System.out.println(numVueOf);
        System.out.println(numNumericValue);

    }
}
