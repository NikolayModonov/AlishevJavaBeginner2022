package day13;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Anya"),
                new User("Borya"),
                new User("Clair"),
                new User("Donald"),
                new User("Emma"));

        for (User user : users) {
            if (!user.equals(users.get(4))) {
                user.subscribe(users.get(4));
            }
        }
        users.get(4).subscribe(users.get(0));

        User user;
        for (int i = 0; i < users.size(); i += 2) {
            user = users.get(i);
            System.out.print(user.getUserName());
            if (user.isFriend(users.get(4))) {
                System.out.print(" is friend ");
            } else if (user.isSubscribe(users.get(4))) {
                System.out.print(" is subscribed ");
            } else {
                System.out.print(" is not subscribed ");
            }
            System.out.println(users.get(4).getUserName());
        }
        System.out.println();

        users.get(0).sendMessage(users.get(4), "Привет!");
        users.get(4).sendMessage(users.get(0), "Привет.");
        users.get(0).sendMessage(users.get(4), "Как дела?");
        users.get(2).sendMessage(users.get(3), "Ололо!");
        users.get(4).sendMessage(users.get(0), "Нормально.");
        users.get(3).sendMessage(users.get(2), "Пепячник!");
        users.get(0).sendMessage(users.get(4), "Идешь гулять?");
        users.get(3).sendMessage(users.get(2), "Ахтунге!");
        users.get(4).sendMessage(users.get(0), "Пошли.");

        MessageDatabase.showDialog(users.get(0), users.get(4));
        System.out.println();
        MessageDatabase.showDialog(users.get(2), users.get(3));
        System.out.println();
        MessageDatabase.showDialog(users.get(1), users.get(3));
        System.out.println();
        System.out.println(MessageDatabase.getMessages().get(5));
    }
}
