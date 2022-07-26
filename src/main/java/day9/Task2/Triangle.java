package day9.Task2;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double perimeter() {
        return (firstSide + secondSide + thirdSide);
    }

    public double area() {
        double p = perimeter() * 0.5;
        return Math.pow((p * (p - firstSide) * (p - secondSide) * (p - thirdSide)), 0.5);
    }

}
