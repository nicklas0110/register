package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherController {
    @FXML
    private Button logoutBt;
    @FXML
    private Button studentInfoBt;

    public void Next(ActionEvent actionEvent) {
    }

    public void logoutBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void studentInfoBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) studentInfoBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/TeacherStudentInfoPage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void statisticsBt(ActionEvent actionEvent) {
    }
}
