package org.example._java_hw_4;

import java.util.Random;

public class KapezKakajaFignya {
    public static void main(String[] args) {
//Есть устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра —
// табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000»
// (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
// (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с
// информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Объяснение: в переменную n должно записываться случайное (на время тестирования программы)
// целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран
// (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает)
// должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

        Random random = new Random(); // написала рандомом, потому, что не представляю от чего отталкиваться.
        // От времени на ноуте? От времени с привязкой к стране? Наверное, я не поняла тему...Математика - явно не моё.
        int n = random.nextInt(28801);

        System.out.println("В секундах тебе ещё тянуть лямку: " + n + " " + "отвратительно долгих секунд. Не надорвись!");

        int hoursBleibt = n / 3600;
        if (hoursBleibt > 1) {
            System.out.println("И да..... Тебе осталось " + hoursBleibt + " томительно долгих часов. Не спасть!");
        } else if (hoursBleibt == 1) {
            System.out.println("Потерпи уже.... Остался 1 час... Убери с лица радость, ты демотивируешь окружающих!");
        } else {
            System.out.println("Ну, еще немного и финиш! Осталось меньше часа и домой!");
        }

    }
}