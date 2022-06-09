package Service;

import Model.User;

import java.util.List;

public class Service {
    public static List<User> getAllUsers() {
        return Service.getAllUsers();
    }
    public static User getUserById(int id) {
        return Service.getUserById(id);
    }
    public static User getUserByUsername(String username) {
        return Service.getUserByUsername(username);
    }
    public static User getUserByName(String name) {
        return Service.getUserByName(name);
    }
}
