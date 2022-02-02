package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectPositionController {

@FXML
private Button buttonStudent;
@FXML
private Button buttonTeacher;

    public void openStudentPage(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) buttonStudent.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Student/2_StudentLogin.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void openTeacherPage(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) buttonTeacher.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/2_TeacherLogin.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }
}
