package gui.Controller;

import be.Complaint;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TeacherStudentInfoController implements Initializable {
    @FXML
    public Button logoutBtThView;
    @FXML
    public Button mainMenu;
    @FXML
    public Button returnBt;
    @FXML
    public Button yesBt;
    @FXML
    public Button noBt;
    @FXML
    private TableView<Complaint> tableView;
    @FXML TableColumn<Complaint, LocalDate> datoColumn;
    @FXML TableColumn<Complaint, String> titleColumn;
    @FXML TableColumn<Complaint, String> detailsColumn;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //sets up columns
        datoColumn.setCellValueFactory(new PropertyValueFactory<Complaint, LocalDate>("dato"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<Complaint, String>("title"));
        detailsColumn.setCellValueFactory(new PropertyValueFactory<Complaint, String>("details"));

        //loads mock data
        tableView.setItems(getComplaints());
    }

    public ObservableList<Complaint> getComplaints() {
        ObservableList<Complaint> complaints = FXCollections.observableArrayList();
        complaints.add(new Complaint(LocalDate.of(2022, 04, 20), "My dog", "I didn't come to school today, because my dog ate my shoes... :("));
        complaints.add(new Complaint(LocalDate.of(2022, 03, 06), "My bike", "My bike was punctured and school is very far away from where i live."));
        complaints.add(new Complaint(LocalDate.of(2022, 02, 25), "Sick", "I tested positive for Corona, so i'm gonna stay home for the next few days."));
        complaints.add(new Complaint(LocalDate.of(2022, 02, 20), "Maybe sick", "I have been in contact with a friend who's got the Corona virus."));
        complaints.add(new Complaint(LocalDate.of(2022, 02, 15), "Slept in", "I couldn't sleep very well last night, so i accidentally slept in."));
        complaints.add(new Complaint(LocalDate.of(2022, 01, 29), "Funeral", "My grandad died."));
        complaints.add(new Complaint(LocalDate.of(2022, 01, 06), "Wedding", "My sister is having her wedding today."));

        return complaints;
    }

    public void logoutBtStView(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) logoutBtThView.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void mainMenu(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) mainMenu.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void yesBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) yesBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/TeacherHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void noBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) noBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/TeacherHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }

    public void returnBt(ActionEvent actionEvent) throws IOException {
        Stage switchScene = (Stage) returnBt.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("../View/Teacher/TeacherHomePage.fxml"));
        Scene scene = new Scene(parent);
        switchScene.setScene(scene);
    }
}
