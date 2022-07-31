package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<MusicBand> bands = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            bands.add(new MusicBand("Band-" + i, 1996 + random.nextInt(10)));
        }
        System.out.println(bands);
        System.out.println();

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println();

        System.out.println(MusicBand.bandsAfter2000(bands));


    }
}
