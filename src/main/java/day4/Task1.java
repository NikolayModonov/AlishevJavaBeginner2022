package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        int countOfNumberBigger8 = 0;
        int countOfNumberEquals1 = 0;
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;
        int sumOfArrayNumbers = 0;
        for (int i : array) {

            if (i > 8) {
                countOfNumberBigger8++;
            } else if (i == 1) {
                countOfNumberEquals1++;
            }

            if (i > 0) {
                if (i % 2 == 0) {
                    countOfEvenNumbers++;
                } else {
                    countOfOddNumbers++;
                }
            }

            sumOfArrayNumbers += i;
        }

        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + countOfNumberBigger8);
        System.out.println("Количество чисел равных 1: " + countOfNumberEquals1);
        System.out.println("Количество четных чисел: " + countOfEvenNumbers);
        System.out.println("Количество нечетных чисел: " + countOfOddNumbers);
        System.out.println("Сумма всех элементов: " + sumOfArrayNumbers);
    }
}
