package day9.Task2;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }


}