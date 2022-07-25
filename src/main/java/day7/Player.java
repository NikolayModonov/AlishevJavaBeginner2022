package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public void run(){
        if (stamina>0){
            stamina--;
        }
    }

    public void info(){
        if (countPlayers < 6){
            System.out.println("Команды не полные, осталось " + (6-countPlayers) + " свободных мест.");
        } else {
            System.out.println("Свободных мест нет.");
        }

    }

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(11) + 90;
    }
}
