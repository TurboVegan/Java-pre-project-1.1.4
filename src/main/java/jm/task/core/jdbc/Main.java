package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("2", "2", (byte) 2);
        userService.saveUser("4", "4", (byte) 4);
        userService.saveUser("6", "6", (byte) 6);
        userService.saveUser("8", "8", (byte) 8);


        userService.getAllUsers();

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
