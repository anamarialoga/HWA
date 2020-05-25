package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMenuCustomer {
    @FXML
    public void goBackToLogin(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/sample.fxml"));
        Scene root2=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(root2);
        window.show();
    }

    @FXML
    public void goToSettings(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/Settings.fxml"));
        Scene root2=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(root2);
        window.show();
    }
    @FXML
    public void goToWorkout(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/Workout.fxml"));
        Scene root2=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(root2);
        window.show();
    }
    @FXML
    public void goToCalendar(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/LogWorkoutDays.fxml"));
        Scene root2 = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(root2);
        window.show();
    }

    @FXML
    public void goToPremiumm(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/PremiumSub.fxml"));
        Scene root2 = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(root2);
        window.show();
    }
}
