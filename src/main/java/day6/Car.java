package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", Color='" + color + '\'' +
                ", Model='" + model + '\'' +
                '}';
    }

    public String getAge(int year) {
        return "" + (year - this.year);
    }

    public String getTypeOfTransport() {
        return "This is a Car";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
