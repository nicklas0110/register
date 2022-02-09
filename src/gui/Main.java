package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/Login.fxml"));

        primaryStage.setTitle("Register Attendance");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setWidth(1190);
        primaryStage.setHeight(730);
         //primaryStage.getScene();
        //primaryStage.setX(0);
        //primaryStage.setY(0);
    }
    public static void main(String[] args) {
        launch(args);
        System.exit(0);
    }
}
