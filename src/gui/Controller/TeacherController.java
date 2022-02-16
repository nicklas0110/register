package gui.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class TeacherController implements Initializable {
    @FXML
    private Button logoutBt;
    @FXML
    private Button studentInfoBt;
    @FXML
    private Button statisticsBt;
    @FXML
    private ComboBox selectStudentMenu;
    @FXML
    private ComboBox selectClassMenu;
    @FXML
    private PieChart chart;
    @FXML
    private Text tekst;

    private int selectedIndex = -1;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        selectStudentMenu.getItems().add("Frederik");
        selectStudentMenu.getItems().add("Mikkel");
        selectStudentMenu.getItems().add("Nicklas");
        selectStudentMenu.getItems().add("Mostafa");
        selectClassMenu.getItems().add("SDE2.A.22");
        selectClassMenu.getItems().add("ITO2.AB.22");
        selectClassMenu.getItems().add("SCO2.A.22");
        selectClassMenu.getItems().add("DBOS.AB.22");
    }

    public void cbChoose(ActionEvent actionEvent) {
        selectedIndex = selectStudentMenu.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            tekst.setText("I didn't come to school today, because my dog ate my shoes :(");
        }
    }


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


        Random r = new Random();
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Monday", r.nextInt(90) + 10),
                new PieChart.Data("Tuesday", r.nextInt(90) + 10),
                new PieChart.Data("Wednesday", r.nextInt(90) + 10),
                new PieChart.Data("Thursday", r.nextInt(90) + 10),
                new PieChart.Data("Friday", r.nextInt(90) + 10)
        );


        chart.setData(pieData);
    }
}
