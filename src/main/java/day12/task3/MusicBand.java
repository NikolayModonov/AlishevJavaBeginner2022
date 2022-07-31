package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static List<MusicBand> bandsAfter2000 (List<MusicBand> bands){
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band:bands){
            if (band.getYear()>1999){
                result.add(band);
            }
        }
        return result;
    }
}
