package day5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("LADA");
        car.setColor("Kosmos");
        car.setYear(2013);
        System.out.println(car.toString());

        Bike bike = new Bike(1986,"Red-n-Black","Harley Davidson");
        System.out.println(bike.toString());
    }
}
