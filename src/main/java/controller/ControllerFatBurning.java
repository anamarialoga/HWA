package controller;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Exercise;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ControllerFatBurning implements Initializable {

    @FXML
    private TableView<Exercise> table;
    @FXML
    private TableColumn<Exercise, String> mon;
    @FXML
    private TableColumn<Exercise, String> tue;
    @FXML
    private TableColumn<Exercise, String> wed;
    @FXML
    private TableColumn<Exercise, String> thu;
    @FXML
    private TableColumn<Exercise, String> fri;
    @FXML
    private TableColumn<Exercise, String> sat;
    @FXML
    private TableColumn<Exercise, String> sun;



    @FXML
    private TextField field1;
    @FXML
    private TextField field2;
    @FXML
    private TextField field3;
    @FXML
    private TextField field4;
    @FXML
    private TextField field5;
    @FXML
    private TextField field6;
    @FXML
    private TextField field7;


    public void goBackk(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/Workout.fxml"));
        Scene newwindow = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        mon.setCellValueFactory(new PropertyValueFactory<Exercise, String>("monday"));
        tue.setCellValueFactory(new PropertyValueFactory<Exercise, String>("tuesday"));
        wed.setCellValueFactory(new PropertyValueFactory<Exercise, String>("wednesday"));
        thu.setCellValueFactory(new PropertyValueFactory<Exercise, String>("thursday"));
        fri.setCellValueFactory(new PropertyValueFactory<Exercise, String>("friday"));
        sat.setCellValueFactory(new PropertyValueFactory<Exercise, String>("saturday"));
        sun.setCellValueFactory(new PropertyValueFactory<Exercise, String>("sunday"));

        table.setItems(getExercise());
        table.setEditable(false);

        mon.setCellFactory(TextFieldTableCell.forTableColumn());
        tue.setCellFactory(TextFieldTableCell.forTableColumn());
        wed.setCellFactory(TextFieldTableCell.forTableColumn());
        thu.setCellFactory(TextFieldTableCell.forTableColumn());
        fri.setCellFactory(TextFieldTableCell.forTableColumn());
        sat.setCellFactory(TextFieldTableCell.forTableColumn());
        sun.setCellFactory(TextFieldTableCell.forTableColumn());

        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    final public ObservableList<Exercise> getExercise(){
        ObservableList<Exercise> data = FXCollections.observableArrayList();
        data.add(new Exercise("Burpees",     "Break", "High Knee", "Break", "Butt Kicks", "Break", "Mountain CLimbers"));
        data.add(new Exercise("Jumping Jacks", "",      "Burpees", "", "Jumping Jacks", "", "SpiderMan Plank"));
        data.add(new Exercise("Butt Kicks",       "",      "Jogging", "", "Bicycles", "", "High Knee"));
        data.add(new Exercise("Jogging",       "",      "Bicycles", "", "High Knee", "", "Abs"));
        data.add(new Exercise("Abs",       "",      "Jumping Jacks", "", "SpiderMan Plank", "", "Burpees"));
        return data;
    }


    public void AddExercises(ActionEvent event) {
    }

    public void DeleteExercises(ActionEvent event) {
    }
}

