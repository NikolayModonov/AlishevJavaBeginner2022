package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscribes;

    public User(String userName) {
        this.userName = userName;
        this.subscribes = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscribes() {
        return subscribes;
    }

    public void subscribe(User user) {
        subscribes.add(user);
    }

    public boolean isSubscribe(User user) {
        return this.subscribes.contains(user);
    }

    public boolean isFriend(User user) {
        return (this.subscribes.contains(user) & user.subscribes.contains(this));
    }

    public void sendMessage(User receiver, String text) {
        MessageDatabase.sendMessage(this, receiver, text);
    }

    @Override
    public String toString() {
        return userName;
    }
}
