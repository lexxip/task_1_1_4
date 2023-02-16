package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/task_1_1_4";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    private Util() {}

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Не удалось установить соединение с базой данных");
            System.exit(0);
        }
        return connection;
    }

}
