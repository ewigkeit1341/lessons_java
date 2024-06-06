package org.example._jawa_hw_6;

import java.util.Scanner;//Представим, что у нас есть устройство,
// в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше
// 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первая температура: ");
        double temperature1  = scanner.nextInt();
        System.out.print("Вторая температура: ");
        double temperature2  = scanner.nextInt();

        boolean isWork = checkTemp(temperature1, temperature2);
        System.out.println("Всё пока что работает (но это не точно): " + isWork);
    }
    public static boolean checkTemp(double temperature1, double temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}
