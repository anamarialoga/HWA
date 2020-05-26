package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import model.Exercise;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerStrength implements Initializable {

    @FXML
    private TableView<Exercise> tableView;

    @FXML private TableColumn<Exercise, String> Column1;
    @FXML private TableColumn<Exercise, String> Column2;
    @FXML private TableColumn<Exercise, String> Column3;
    @FXML private TableColumn<Exercise, String> Column4;
    @FXML private TableColumn<Exercise, String> Column5;
    @FXML private TableColumn<Exercise, String> Column6;
    @FXML private TableColumn<Exercise, String> Column7;


    @FXML private TextField field1;
    @FXML private TextField field2;
    @FXML private TextField field3;
    @FXML private TextField field4;
    @FXML private TextField field5;
    @FXML private TextField field6;
    @FXML private TextField field7;


    public void goBackk(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/Workout.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }

    public void newExercise(ActionEvent event) {
        Exercise newExercise = new Exercise(field1.getText(), field2.getText(), field3.getText(), field4.getText(), field5.getText(), field6.getText(), field7.getText() );
        tableView.getItems().add(newExercise);
    }

    public void deleteExercise(ActionEvent event) {
        ObservableList<Exercise> selectedRows, allPeople;
        allPeople = tableView.getItems();

        selectedRows = tableView.getSelectionModel().getSelectedItems();
        for (Exercise exercise : selectedRows)
        {
            allPeople.remove(exercise);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Column1.setCellValueFactory(new PropertyValueFactory<>("monday"));
        Column2.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        Column3.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        Column4.setCellValueFactory(new PropertyValueFactory<>("thursday"));
        Column5.setCellValueFactory(new PropertyValueFactory<>("friday"));
        Column6.setCellValueFactory(new PropertyValueFactory<>("saturday"));
        Column7.setCellValueFactory(new PropertyValueFactory<>("sunday"));

        tableView.setItems(getEx());

        tableView.setEditable(true);
        Column1.setCellFactory(TextFieldTableCell.<Exercise>forTableColumn());
        Column2.setCellFactory(TextFieldTableCell.<Exercise>forTableColumn());
        Column3.setCellFactory(TextFieldTableCell.forTableColumn());
        Column4.setCellFactory(TextFieldTableCell.<Exercise>forTableColumn());
        Column5.setCellFactory(TextFieldTableCell.<Exercise>forTableColumn());
        Column6.setCellFactory(TextFieldTableCell.<Exercise>forTableColumn());
        Column7.setCellFactory(TextFieldTableCell.<Exercise>forTableColumn());

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public ObservableList<Exercise>  getEx()
    {
        ObservableList<Exercise> data = FXCollections.observableArrayList();

        data.add(new Exercise("Plank",     "Break", "Decline Push-up", "Break", "Pull-Ups", "Break", "Muscle Up"));
        data.add(new Exercise("Roussian Twist", "",      "Side-Plank", "", "UpAndDown Plank", "", "Box Jumps"));
        data.add(new Exercise("Push-Ups",       "",      "Boat Hold", "", "Wall Sit", "", "Side-Plank"));
        data.add(new Exercise("Box Jumps",       "",      "UpAndDown Plank", "", "Roussian Twist", "", "Butterflies"));
        data.add(new Exercise("Wall Sit",       "",      "BUtterflies", "", "Muscle Up", "", "Push-ups"));

        return data;
    }
}
