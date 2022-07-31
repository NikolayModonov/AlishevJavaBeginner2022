package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("Anana", 2013, Arrays.asList(
                new MusicArtist("Anna", 1990),
                new MusicArtist("Anton", 1994),
                new MusicArtist("Arina", 1998)));
        MusicBand bandB = new MusicBand("Banana", 2002, Arrays.asList(
                new MusicArtist("Boris", 1996),
                new MusicArtist("Berry", 1992),
                new MusicArtist("Bogdan", 1993)));

        bandA.printMembers();
        bandB.printMembers();
        System.out.println();
        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();
        System.out.println();
        System.out.println(bandB);
    }
}
