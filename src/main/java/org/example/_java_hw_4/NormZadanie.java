package org.example._java_hw_4;

public class NormZadanie {
    public static void main(String[] args) {
    //Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
    //Числа могут быть, как целочисленные, так и дробные.
    //Например :
    //ввод : m=10.5, n=10.45
    //вывод: Число 10.45 ближе к 10.

        double m = 10.5;
        double n = 10.45;

        double nums = findNums(m, n);
        System.out.println("Число " + nums + " ближе к 10.");

    }
    public static double findNums(double m, double n) {
        double nearM = Math.abs(10 - m); // не уверена, можно ли использовать Math.abs, в гугле противоречиво написано,
        // что меняет значение с положительного на отрицательное, в других источниках утверждается, что этот метод
        // рассчитывает расстояние каждого числа от искомого, сравнивает расстояния и возвращает число, которое ближе
        // к нужному. Но вроде работает...
        double nearN = Math.abs(10 - n);

        if (nearM < nearN) {
            return m;
        } else {
            return n;
        }

    }
}
