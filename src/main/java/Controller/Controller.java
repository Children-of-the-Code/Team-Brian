package Controller;

import Model.User;
import Service.Service;

import java.util.List;

public class Controller {
    Service service;
    public Controller(Service service) {
        this.service = service;
    }
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    public User getUserById(int id) {
        return service.getUserById(id);
    }
    public User getUserByUsername(String username) {
        return service.getUserByUsername(username);
    }
}
