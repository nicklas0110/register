package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentController {

    @FXML
    private Button logoutBt;

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

    public void yesBt(ActionEvent actionEvent) throws IOException {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(
                    yesANDno.class.getResource("../View/Student/yes&no.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("y/n");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(
                    ((Node)actionEvent.getSource()).getScene().getWindow() );
            stage.show();
    }
    public void noBt(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                yesANDno.class.getResource("../View/Student/yes&no.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("y/n");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();
    }
}
