package gui.Controller.StudentControllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentController {
    @FXML
    public JFXButton yesBt;
    @FXML
    private Button logoutBt;

    @FXML
    private Button LogoutButtonStudentID;

    public void YesBt(ActionEvent actionEvent) throws IOException {
        Stage popupScene = (Stage) yesBt.getScene().getWindow();
        popupScene.initModality(Modality.APPLICATION_MODAL);
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Student/StudentViewPage.fxml"));
        Scene scene = new Scene(parent);
        popupScene.setScene(scene);
    }

    public void noBt(ActionEvent actionEvent) {
    }


    public void continueBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Student/StudentViewPage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }



    public void logoutBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }



    public void LogoutButtonStudentAction(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) LogoutButtonStudentID.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }
}
