package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/Login.fxml"));

        primaryStage.setTitle("Register Attendance");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setWidth(1190);
        primaryStage.setHeight(730);

        Image icon = new Image(getClass().getResourceAsStream("View/Pictures/1200px-OOjs_UI_icon_userAvatar.svg.png"));
        primaryStage.getIcons().add(icon);


    }
    public static void main(String[] args) {
        launch(args);
        System.exit(0);
    }
}
