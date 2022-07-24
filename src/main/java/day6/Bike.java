package day6;

public class Bike {
    private int year;
    private String color;
    private String model;

    public Bike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike {" +
                "year=" + year +
                ", Color='" + color + '\'' +
                ", Model='" + model + '\'' +
                '}';
    }

    public int getAge(int year) {
        return year - this.year;
    }

    public String getTypeOfTransport() {
        return "This is a Bike";
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
