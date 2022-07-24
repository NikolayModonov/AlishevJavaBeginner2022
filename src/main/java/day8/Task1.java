package day8;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1988, 107, 113);
        Airplane airplane2 = new Airplane("Honda Jet", 2020, 17, 15);

        airplane1.compareAirpanesLength(airplane2);
        airplane2.compareAirpanesLength(airplane1);
        airplane1.compareAirpanesLength(airplane1);


    }
}
