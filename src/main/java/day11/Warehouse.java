package day11;

import java.util.Locale;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse {" +
                "countOrder = " + String.format(Locale.CANADA_FRENCH, "%,d", countOrder) +
                ", balance = " + String.format(Locale.CANADA_FRENCH, "%,d", balance) +
                '}';
    }
}
