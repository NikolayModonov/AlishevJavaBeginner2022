package day9.Task2;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double perimeter() {
        return 2 * (firstSide + secondSide);
    }

    public double area() {
        return firstSide * secondSide;
    }

}
