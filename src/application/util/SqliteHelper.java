package application.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteHelper {
    public static Connection LoginConnector(){

        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
            return connection;

        } catch (Exception e) {
            System.out.println();
            return  null;
        }

    }
}
