package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentViewPageController {
    @FXML
    public Button mainVeiwBtn;
    @FXML
    private Button logoutBtStView;

    public void logoutBtStView(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtStView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void backMainVeiwBtn(ActionEvent actionEvent) {
    }
}
