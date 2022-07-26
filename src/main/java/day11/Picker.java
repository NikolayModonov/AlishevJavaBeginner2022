package day11;

import java.util.Locale;

public class Picker implements Worker {
    private int salary ;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Picker {" +
                "salary = " + String.format(Locale.CANADA_FRENCH, "%,d", salary) +
                '}';
    }

    @Override
    public void doWork() {
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        salary += 80;
        if (warehouse.getCountOrder() == 1500) {
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
    }
}
