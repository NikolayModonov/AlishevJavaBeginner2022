package day8;

public class Airplane {
    private int year;
    private String manufacturer;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Manufacturer='" + manufacturer + "' " +
                "{year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }

    public void compareAirpanesLength(Airplane airplane){
        if (this.length > airplane.length){
            System.out.println("Your plane length is biggest");
        } else if (this.length < airplane.length){
            System.out.println("Second plane length is biggest");
        } else {
            System.out.println("Plane lengths is equals");
        }
    };


    public void fillUp(int fuelWeight) {
        this.fuel += fuelWeight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
