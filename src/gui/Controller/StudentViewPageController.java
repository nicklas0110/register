package gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class StudentViewPageController {
    @FXML
    public Button mainVeiwBtn;
    @FXML
    private Button logoutBtStView;
    @FXML
    private BarChart<String, Number> chart;

    public void logoutBtStView(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtStView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void backMainVeiwBtn(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtStView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Student/StudentHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }




    public void drawChart(ActionEvent actionEvent) {
        Axis<String> xAxis = chart.getXAxis();
        xAxis.setLabel("Day");

        /*Axis<Number> yAxis = chart.getYAxis();
        yAxis.setLabel("Amount");

         */


        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            XYChart.Series<String, Number> series = new XYChart.Series<>();
            series.setName("Week " + (i + 4));

            series.getData().add(new XYChart.Data<>("Monday", r.nextInt(10) + 10));
            series.getData().add(new XYChart.Data<>("Tuesday", r.nextInt(20) + 23));
            series.getData().add(new XYChart.Data<>("Wednesday", r.nextInt(40) + 45));
            series.getData().add(new XYChart.Data<>("Thursday", r.nextInt(50) + 55));
            series.getData().add(new XYChart.Data<>("Friday", r.nextInt(70) + 75));
            chart.getData().add(series);
        }

    }

}
