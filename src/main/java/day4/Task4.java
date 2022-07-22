package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int sum = 0;
        int biggestSum = 0;
        int indexOfBiggestSum = -1;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > biggestSum) {
                biggestSum = sum;
                indexOfBiggestSum = i;
            }
        }

        System.out.println(indexOfBiggestSum + " - " + biggestSum);


    }
}
