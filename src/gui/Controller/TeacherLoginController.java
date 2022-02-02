package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherLoginController {
    @FXML
    private Button buttonBack;

    public void Next(ActionEvent actionEvent) {
    }

    public void Back(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) buttonBack.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/1_SelectPosition.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }
}
