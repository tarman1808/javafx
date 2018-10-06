package application.model;

import application.util.SqliteHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    Connection connection;

    public LoginModel(){
        connection = SqliteHelper.LoginConnector();
        if (connection == null){
            System.exit(1);
        }
    }

    public boolean isLoginValid(String user, String pass) throws SQLException {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String query = "select * from user where username=? and password=?";


        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();

        } catch (Exception e) {
            return false;
        } finally {
            assert preparedStatement != null;
            assert resultSet != null;

        }


    }
}
