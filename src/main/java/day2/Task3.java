package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        System.out.println("Введите второе число");
        scanner = new Scanner(System.in);
        int secondInt = scanner.nextInt();
        if (secondInt < firstInt) {
            secondInt += firstInt;
            firstInt = secondInt - firstInt;
            secondInt -= firstInt;
        }
        int i = firstInt + 1;
        while (i < secondInt) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
            i++;
        }


    }
}
