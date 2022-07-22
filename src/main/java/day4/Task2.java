package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
        }

        int biggestNumberOfArray = 0;
        int smallestNumberOfArray = 10000;
        int countOfNumbersEndingZero = 0;
        int sumOfNumbersEndingZero = 0;
        for (int i : array) {

            if (i > biggestNumberOfArray) {
                biggestNumberOfArray = i;
            }

            if (i < smallestNumberOfArray) {
                smallestNumberOfArray = i;
            }

            if (i % 10 == 0) {
                countOfNumbersEndingZero++;
                sumOfNumbersEndingZero += i;
            }
        }

        System.out.println("Наибольший элемент массива: " + biggestNumberOfArray);
        System.out.println("Наименьший элемент массива: " + smallestNumberOfArray);
        System.out.println("Количество элементов, оканчивающихся на 0: " + countOfNumbersEndingZero);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sumOfNumbersEndingZero);

        //вывод массива
        /*System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ": ");
            for (int j = 0 + 10 * i; j < 10 + 10 * i; j++) {
                System.out.print(array[j] + ", ");
            }
            System.out.println();
        }*/

    }
}
