package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> artists;

    public MusicBand(String name, int year, List<String> artists) {
        this.name = name;
        this.year = year;
        this.artists = new ArrayList<>(artists);
    }

    public static List<MusicBand> bandsAfter2000(List<MusicBand> bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 1999) {
                result.add(band);
            }
        }
        return result;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.artists.addAll(band1.getArtists());
        band1.artists.clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }

    public void printMembers() {
        System.out.println(name + " artists: " + artists);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = new ArrayList<>(artists);
    }
}