package day6;

public class Car {
    private int year;
    private String Color;
    private String Model;

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
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
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
