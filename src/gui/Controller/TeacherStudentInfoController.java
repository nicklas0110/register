package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherStudentInfoController {
    @FXML
    public Button logoutBtThView;
    @FXML
    public Button mainMenu;
    @FXML
    public Button returnBt;

    public void logoutBtStView(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtThView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void mainMenu(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtThView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void yesBt(ActionEvent actionEvent) {
    }

    public void noBt(ActionEvent actionEvent) {
    }

    public void returnBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtThView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/TeacherHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }
}
