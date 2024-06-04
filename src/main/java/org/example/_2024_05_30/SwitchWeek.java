package org.example._2024_05_30;

public class SwitchWeek {
    public static void main(String[] args) {
    //Создайте switch-блок с днями недели
    //Создайте переменные int day; String dayString;
    //В каждом кейсе инициализируйте переменную dayString правильным значением.
    //Запустите программу, передав в switch-условие день 2.

//        int day = 2;
//        String dayString;
//        switch (day) {
//            case 1:  dayString = "Montag";
//                break;
//            case 2:  dayString = "Dienstag";
//                break;
//            case 3:  dayString = "Mittwoch";
//                break;
//            case 4:  dayString = "Donnerstag";
//                break;
//            case 5:  dayString = "Freitag";
//                break;
//            case 6:  dayString = "Sonnabend";
//                break;
//            case 7: dayString = "Sonntag";
//                break;
//
//            default: dayString = "Нет такого дня";
//                break;
//        }
//        System.out.println(dayString);


        //===============================================================

        //Создайте switch-блок, который мог бы определить, является ли переданный день выходным или рабочим днем.
        //Создайте переменные int day; String dayString;
        //Используйте объединение для несколько случаев без операторов break
        //Реализуйте тот же процесс используя if-else блоки
        //Реализуйте тот же процесс используя тернарное выражение
        //Сравните решения

        int day = 5;
        String dayString = "";
        switch (day) {
            case 1: case 2: case 3: case 4: case 5: dayString = "Рабочий день"; break;
            case 6: case 7: dayString = "Выходной"; break;
            default: dayString = "Invalid day";
        }
        System.out.println("Сегодня " + dayString);

        if (day > 0 && day < 6) {
            System.out.println("Рабочий день");
        } else if ( day > 5 && day < 8) {
            System.out.println("Выходной");
        }
        else {
            System.out.println("Invalid day");
        }

     //======================================================

     //переменная int temperature, которая представляет собой температуру воздуха в градусах Цельсия.
        //Мы хотим вывести сообщение в зависимости от значения температуры:
        //Если температура равна 0, вывести сообщение "This is the freezing point."
        //Если температура равна 20, вывести сообщение "This is room temperature."
        //Если температура равна 100, вывести сообщение "This is the boiling point."
        //В противном случае вывести сообщение "Temperature is not a special quantity."

        int temperature = 20;
        String grad = null;
        switch (temperature) {
            case 0:  grad = "This is the freezing point.";
                break;
            case 20:  grad = "This is room temperature.";
                break;
            case 100:  grad = "This is the boiling point.";
                break;

            default: grad = "Temperature is not a special quantity.";
        }
        System.out.println(grad);

//        if (temperature == 0) {
//            System.out.println("This is the freezing point.");
//        } else if (temperature == 20) {
//            System.out.println("This is room temperature.");
//        }else if (temperature == 100) {
//            System.out.println("This is the boiling point.");
//        }else {
//            System.out.println("Temperature is not a special quantity.");
//        }



    }
}
