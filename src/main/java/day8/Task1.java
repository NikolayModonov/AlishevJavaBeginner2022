package day8;

public class Task1 {
    public static void main(String[] args) {
        long startString = System.currentTimeMillis();
        String string = "";

        for (int i = 0; i <= 200000; i++) {
            string += (i + " ");
        }
        long stopStringMake = System.currentTimeMillis();
        System.out.println(string);

        long startStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i <= 200000; i++) {
            stringBuilder.append(i + " ");
        }
        long stopStringBuilderMake = System.currentTimeMillis();
        System.out.println(stringBuilder);

        long stop = System.currentTimeMillis();

        System.out.println("Время выполнения программы с переменной String: " +
                (startStringBuilder-startString));
        System.out.println("Создание строки: " + (stopStringMake - startString) +
                ". Вывод строки: " + (startStringBuilder - stopStringMake));
        System.out.println();
        System.out.println("Время выполнения программы с переменной StringBuilder: " +
                (stop-startStringBuilder));
        System.out.println("Создание строки: " + (stopStringBuilderMake - startStringBuilder) +
                ". Вывод строки: " + (stop - stopStringBuilderMake));

    }
}