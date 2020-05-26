package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import model.Exercise;

public class ControllerFatBurn2 implements Initializable {


    @FXML private TableView<Exercise> tableView;

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



    @Override
    public void initialize(URL url, ResourceBundle rb) {

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

    public void deleteExercise()
    {
        ObservableList<Exercise> selectedRows, allEx;
        allEx = tableView.getItems();

        selectedRows = tableView.getSelectionModel().getSelectedItems();
        for (Exercise exercise : selectedRows)
        {
            allEx.remove(exercise);
        }
    }

    public void newExercise()
    {
        Exercise newExercise = new Exercise(field1.getText(), field2.getText(), field3.getText(), field4.getText(), field5.getText(), field6.getText(), field7.getText() );
        tableView.getItems().add(newExercise);
    }

    public ObservableList<Exercise>  getEx()
    {
        ObservableList<Exercise> data = FXCollections.observableArrayList();

        data.add(new Exercise("Burpees",     "Break", "High Knee", "Break", "Butt Kicks", "Break", "Mountain CLimbers"));
        data.add(new Exercise("Jumping Jacks", "",      "Burpees", "", "Jumping Jacks", "", "SpiderMan Plank"));
        data.add(new Exercise("Butt Kicks",       "",      "Jogging", "", "Bicycles", "", "High Knee"));
        data.add(new Exercise("Jogging",       "",      "Bicycles", "", "High Knee", "", "Abs"));
        data.add(new Exercise("Abs",       "",      "Jumping Jacks", "", "SpiderMan Plank", "", "Burpees"));

        return data;
    }

    public void goBackk(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/WorkoutT.fxml"));
        Scene newwindow = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }
}
