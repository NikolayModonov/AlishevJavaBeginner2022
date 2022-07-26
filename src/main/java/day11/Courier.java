package day11;

import java.util.Locale;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier {" +
                "salary = " + String.format(Locale.CANADA_FRENCH, "%,d", salary) +
                '}';
    }

    @Override
    public void doWork() {
        warehouse.setBalance(warehouse.getBalance() + 1000);
        salary += 100;
        if (warehouse.getBalance() == 1_000_000) {
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
    }
}
