package Tugas_CLI;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private java.util.List<User> users = new java.util.ArrayList<>();

    public void addUser(String name, String email) {
        users.add(new User(name, email));
    }

    public java.util.List<User> getAllUsers() {
        return users;
    }

    public boolean isEmpty() {
        return users.isEmpty();
    }
}


