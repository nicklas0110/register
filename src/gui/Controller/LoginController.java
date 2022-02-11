package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

@FXML
private Button loginSudentBt;
@FXML
private Button loginTeacherBt;


    public void loginSudentBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) loginSudentBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Student/StudentHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void loginTeacherBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) loginTeacherBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/TeacherHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }
}
