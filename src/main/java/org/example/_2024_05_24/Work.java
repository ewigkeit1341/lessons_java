package org.example._2024_05_24;

public class Work {
    public static void main(String[] args) {
        printFirstLastMiddleChar("Tegusigalpa");
    }
    //Дана строка. Вывести первый, последний и средний (если он есть) символы.

    public static void printFirstLastMiddleChar(String stringInput){
        int length = stringInput.length();

        System.out.println(stringInput.charAt(0));

        System.out.println(stringInput.charAt(stringInput.length()-1));
        //или
          int lastIndex = stringInput.length()-1;
          char lastChar = stringInput.charAt(lastIndex);
        System.out.println(lastChar);

        if (length > 2 && length %2 != 0){
            System.out.println(stringInput.charAt(length/2));
        }

    }
    //Допзадачи:
//3.	Сформировать строку из 10 символов. На четных позициях должны находится четные цифры, на нечетных позициях - буквы.
//4.	Дана строка. Показать номера символов, совпадающих с последним символом строки.
//5.	Дана строка. Показать третий, шестой, девятый и так далее символы.
//6.	Дана строка. Вывести первые три символа и последние три символа, если длина строки больше 5. Иначе вывести первый символ столько раз, какова длина строки
//7.	Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'. Если какого-то из символов нет, вывести сообщение об этом.

}
