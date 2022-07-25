package day7;

import java.util.Random;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(11) + 90;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA){
                countPlayers--;
            }
        } else {
            System.out.println("Действие невозможно, игрок выбыл из игры.");
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные, осталось " + (6 - countPlayers) + " свободных мест.");
        } else {
            System.out.println("Свободных мест нет.");
        }
    }
}
