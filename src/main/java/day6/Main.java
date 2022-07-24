package day6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2013);
        System.out.println(car.getAge(2022));
        System.out.println(car.getTypeOfTransport());

        Bike bike = new Bike(1986, "Red-n-Black", "Harley Davidson");
        System.out.println(bike.getAge(2022));
        System.out.println(bike.getTypeOfTransport());

        Airplane airplane = new Airplane("Airbus", 1993, 102, 120);
        airplane.setYear(1997);
        airplane.setLength(107);
        airplane.fillUp(30);
        airplane.fillUp(12);
        airplane.info();
    }
}
