package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class Main extends Application {

    private static Stage stage;
    private static BorderPane mainlayout;
    

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
        Main.stage = primaryStage;
        Main.stage.setTitle("Karawang");
        stage.setMaximized(true);
        Main.showMain();
        Main.showLogin();

    }

    private static void showMain() throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainlayout = loader.load();
        Scene scene = new Scene(mainlayout);
        stage.setScene(scene);
        stage.show();
    }

    private static void showLogin() throws IOException {
<<<<<<< HEAD
        
=======
>>>>>>> 685c50dc2890ca545dbcaee92e93fef1576c741e
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/Login.fxml"));
        AnchorPane mainItem = loader.load();
        mainlayout.setCenter(mainItem);
        
    }

    public static void showUser() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/Home.fxml"));
        BorderPane mainItem = loader.load();
        mainlayout.setCenter(mainItem);

    }

    public static void showAdmin() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/Admin.fxml"));
        BorderPane mainItem = loader.load();
        mainlayout.setCenter(mainItem);

    }

    public static void Main(String[] args) {
        launch(args);
    }
}
