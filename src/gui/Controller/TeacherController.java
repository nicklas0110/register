package gui.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class TeacherController {
    @FXML
    private Button logoutBt;
    @FXML
    private Button studentInfoBt;
    @FXML
    private Button statisticsBt;

    @FXML
    private PieChart chart;


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
