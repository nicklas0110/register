package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/1_SelectPosition.fxml"));

        primaryStage.setTitle("Register Attendance");
        primaryStage.setScene(new Scene(root, 920, 500));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
        System.exit(0);
    }
}