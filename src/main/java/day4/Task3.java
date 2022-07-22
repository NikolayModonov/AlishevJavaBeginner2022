package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];
        int sum = 0;
        int biggestSum = 0;
        int indexOfBiggestSum = -1;

        for (int i = 0; i < 12; i++) {
            sum = 0;
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(51);
                sum += array[i][j];
            }
            if (sum >= biggestSum) {
                biggestSum = sum;
                indexOfBiggestSum = i + 1;
            }
        }

        System.out.println(biggestSum + " - " + indexOfBiggestSum);


        //вывод массива
        /*for (int i = 0; i < 12; i++) {
            System.out.println((i + 1) + " - " + Arrays.toString(array[i]));
        }*/

    }
}
