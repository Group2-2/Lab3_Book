package group.two.two.lab3.controller.model.dao;

import group.two.two.lab3.controller.model.Login;
import group.two.two.lab3.controller.model.User;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

public class ListDAO implements DAO {
    private Map<String, User> map;

    public ListDAO() {
        map = new HashMap<>();
        map.put("kam", new User("kam", "pass", "anton", "kudrya"));
    }

    @Override
    public User getUserByLogin(String login) {
        return map.get(login);
    }

    @Override
    public boolean registartion(User user) {
        if (map.containsKey(user.getUsername())) {
            return false;
        } else {
            map.put(user.getUsername(), user);
            return true;
        }
    }

    @Override
    public boolean login(Login login) {
        User user = map.get(login.getUsername());
        if (user != null) {
            return login.getPassword().equals(user.getPassword());
        }
        return false;
    }
}
