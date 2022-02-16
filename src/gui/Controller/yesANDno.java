package gui.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.awt.*;

public class yesANDno {

    @FXML
    public Button no;
    @FXML
    public Button yes;


    public void yes(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void no(ActionEvent actionEvent) {
        Platform.exit();
    }
}
