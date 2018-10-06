package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Main extends Application {

    public static Stage stage;
    private static BorderPane mainlayout;

    @Override
    public void start(Stage primaryStage) throws IOException {
        Main.stage = primaryStage;
        Main.stage.setTitle("Karawang");
        stage.setMaximized(true);
        Main.showMain();
        Main.showLogin();

    }

    public static void showMain() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainlayout = loader.load();
        Scene scene = new Scene(mainlayout);
        stage.setScene(scene);
        stage.show();
    }

    public static void showLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/Login.fxml"));
        BorderPane mainItem = loader.load();
        mainlayout.setCenter(mainItem);

    }

    public static void showHome() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/Home.fxml"));
        BorderPane mainItem = loader.load();
        mainlayout.setCenter(mainItem);

    }

    public static void Main(String[] args) {
        launch(args);
    }
}
