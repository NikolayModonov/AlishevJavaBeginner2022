package day12.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("Anana", 2013, Arrays.asList("artist A1", "artist A2", "artist A3"));
        MusicBand bandB = new MusicBand("Banana", 2021, Arrays.asList("artist B1", "artist B2", "artist B3"));

        bandA.printMembers();
        bandB.printMembers();
        System.out.println();
        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();
        System.out.println();

    }
}
