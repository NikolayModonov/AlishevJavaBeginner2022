package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.printf("%.4f", calculateRedArea(figures));
        System.out.println();

        System.out.printf("%.4f", calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double result = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                result += figure.perimeter();
            }
        }
        return result;
    }

    public static double calculateRedArea(Figure[] figures) {
        double result = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                result += figure.area();
            }
        }
        return result;

    }

}

/*
Абстрактный класс Фигура (англ. Figure).
строковое поле Цвет, color
Конструктор, геттер и сеттер.
два абстрактных метода, возвращают площадь и периметр:
public abstract double area();
public abstract double perimeter();

3 геометрические фигуры: Круг Circle, Прямоугольник Rectangle, Треугольник Triangle
наследуются от Фигура
У класса Круг будет одно поле - радиус окружности.
У класса Прямоугольник будет два поля - ширина и высота.
У класса Треугольник будет три поля - длина каждой из сторон.
Для каждого из этих трех классов необходимо реализовать конструктор, который
принимает на вход размерности фигуры и цвет фигуры.
В классах реализовать два метода (area() и perimeter()).

реализовать класс TestFigures.
В  методе main() создать и поместить в массив фигуры:


*/
