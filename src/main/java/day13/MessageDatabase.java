package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        User sender;
        User receiver;
        for (Message message : messages) {
            sender = message.getSender();
            receiver = message.getReceiver();
            if ((sender.equals(u1) || sender.equals(u2)) &&
                    (receiver.equals(u1) || receiver.equals(u2))) {
                System.out.println(sender + ": " + message.getText());
            }
        }
    }


}
