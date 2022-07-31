package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Cad");
        list.add("LAD");
        list.add("BMW");
        list.add("Fiat");
        System.out.println(list);

        list.add(2, "NCR");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
