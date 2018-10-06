package application.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteHelper {
    public static Connection LoginConnector(){

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
            return conn;

        } catch (Exception e) {
            System.out.println();
            return  null;
        }

    }
}
