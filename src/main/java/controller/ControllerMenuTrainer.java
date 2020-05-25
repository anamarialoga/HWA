package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMenuTrainer {

    @FXML
    public void goToSettings2(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/SettingsT.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }

    @FXML
    public void goEditWorkouts(ActionEvent event) {

    }

    public void goToChat(ActionEvent event) {
    }

    public void goToCustomersList(ActionEvent event) {
    }

    public void goBackToLogin(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/sample.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }
}
