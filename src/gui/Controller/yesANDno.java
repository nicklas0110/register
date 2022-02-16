package gui.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class yesANDno {

    @FXML
    public Button no;
    @FXML
    public Button yes;


    public void yes(ActionEvent actionEvent) throws IOException {
        Platform.exit();
    }

    public void no(ActionEvent actionEvent) {

    }
}
