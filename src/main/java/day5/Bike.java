package day5;

public class Bike {
    private int year;
    private String Color;
    private String Model;

    @Override
    public String toString() {
        return "Bike {" +
                "year=" + year +
                ", Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }


    public Bike(int year, String color, String model) {
        this.year = year;
        Color = color;
        Model = model;
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
