package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Exercise;

import java.io.IOException;

public class ControllerWorkout {
    public void goBackk(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/customerMenu.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }

    public void goToFatBurning(ActionEvent event) throws IOException {
       Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/FatBurning.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();


        window.setScene(newwindow);
        window.show();
    }




    public void goToStrengthBuilding(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/Strength.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();


        window.setScene(newwindow);
        window.show();
    }

    public void goToBodyBuilding(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/BodyBuilding.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }
}
