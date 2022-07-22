package day2;

import java.util.Scanner;

public class Task2 {
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

        for (int i = firstInt + 1; i < secondInt; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }


    }
}

/*2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие
(делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие
(делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
При вводе a = b или a > b вывести сообщение "Некорректный ввод".

Пример:
Вводим в консоли: 7 78
Вывод: 15 25 35 45 55 65 75

*/
