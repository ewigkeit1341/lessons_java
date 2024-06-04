package org.example._2024_06_03;

import java.util.Random;

public class CycleFor {
    public static void main(String[] args){
    //  Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
    //  Вычислить процент положительных чисел, процент отрицательных чисел и
    //  процент нулей. Вычислить процент чётных чисел и процент нечётных.
        Random random = new Random();

        int min = -100;
        int max = 100;
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int notOdd = 0;
        int zero = 0;
        for (int n = -100; n <= 100; n++){
            int randomnum = random.nextInt(min, max);
            if(randomnum < 0) {
                neg++;
            }else if(randomnum > 0){
                pos++;
            }else {
                zero++;
            }
            if(randomnum % 2 == 0){
                notOdd++;
            }else {
                odd++;
            }

        }
        System.out.println("Positives " + pos);
        System.out.println("Negatives " + neg);
        System.out.println("Odds " + notOdd);
        System.out.println("Not odds " + odd);
        System.out.println("Zeros " + zero);
    }
}
