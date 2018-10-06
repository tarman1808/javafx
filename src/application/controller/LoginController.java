package application.controller;

import application.Main;
import application.model.LoginModel;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {


    LoginModel loginModel = new LoginModel();

    @FXML
    private JFXTextField usernametf;

    @FXML
    private JFXPasswordField passwordtf;

    @FXML
    private Button loginbtn;

    @FXML
    private Label errorLogin;

    @FXML
    void goLogin() throws IOException {
        try {
            if (loginModel.isLoginValid(usernametf.getText(), passwordtf.getText())) {
                Main.showUser();
            } else {
                errorLogin.setText("Error! Invalid Username or Password");
            }

        } catch (SQLException e) {
            errorLogin.setText("Error! Invalid Username or Password");
            e.printStackTrace();
        }
    }
}
