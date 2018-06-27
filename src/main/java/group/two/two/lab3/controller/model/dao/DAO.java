package group.two.two.lab3.controller.model.dao;

import group.two.two.lab3.controller.model.Login;
import group.two.two.lab3.controller.model.User;

public interface DAO {
    User getUserByLogin(String login);
    boolean registartion(User user);
    boolean login(Login login);

}
