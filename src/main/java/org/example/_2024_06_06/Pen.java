package org.example._2024_06_06;

public class Pen {

//    Создайте класс ручка (Pen)
//    Определите свойство color типа String с доступом private
//    Создайте методы getColor(); setColor(String newColor);
//    Создайте класс Test
//    Создайте три объекта типа Pen
//    Создайте массив L = 3
//    Сохраните все объекты в массив
//    Достаньте поочередно из массива ручки и измените цвет каждой на
//            “Green”
//            “Red”
//            “Black”

    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }

    @Override
    public String toString() {
        return color;
    }

}



