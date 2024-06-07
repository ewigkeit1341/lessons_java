package org.example._2024_06_07;

//В массиве найти максимальный элемент
public class PractTask1 {
    public static void main(String[] args) {
        int[] arrNew = {67, 6, 12, 100, -1, 0};

//        System.out.println(getMax(arrNew));
        System.out.println(getMaxIndex(arrNew));
        System.out.println(getMaxIndex2(arrNew));
        System.out.println(getSumEvenPositive(arrNew));
        System.out.println(getAverage(arrNew));
        System.out.println(getLessThanAverage(arrNew));
    }

//    public static int getMax (int[] arr){
//        int maxN = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if (arr[i] > maxN){
//                maxN = arr[i];
//            }
//        }
//        return maxN;
//    }

    //В массиве найти максимальный элемент с четным индексом
    public static int getMaxIndex(int[] arr) {
        int maxIndex = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > maxIndex && j % 2 == 0) {
//           проверка на четность j % 2 ==0
                maxIndex = arr[j];
            }
        }
        return maxIndex;
    }

    public static int getMaxIndex2(int[] arr) {
        int maxIndex = arr[0];
        for (int j = 2; j < arr.length; j += 2) {
//            j = j + 2
            if (arr[j] > maxIndex) {
                maxIndex = arr[j];
            }
        }
        return maxIndex;
    }

    //В массиве, содержащем положительные и отрицательные целые числа,
    //вычислить сумму четных положительных элементов

    public static int getSumEvenPositive(int[] arr) {
        int sum = 0;
        for (int s = 0; s < arr.length; s++) {
            if (arr[s] % 2 == 0) {
                if (arr[s] > 0) {
                    sum = sum + arr[s];
                }
            }
        }
        return  sum;
    }



    //Найти среднее арифметическое от всех элементов массива
    public static double getAverage(int[] arr){
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++){
            sum1 = sum1 + arr[i];
        }
        return (double) sum1 / arr.length;
    }

    //Найти в массиве те элементы, значение которых меньше среднего арифметического,
    //взятого от всех элементов массива
    public static int[] getLessThanAverage(int[] arr) {
        double average = getAverage(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        int[] result = new int[count];
        int count2 = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < average) {
                result[count2]= arr[i];
                count2++;
            }
        }
        return result;
    }

}
