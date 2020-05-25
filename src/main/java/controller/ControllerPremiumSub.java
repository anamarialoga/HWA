package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPremiumSub {

    @FXML
    private TextField nameField;
    @FXML
    private TextField cvvField;
    @FXML
    private Text messageField;
    @FXML
    private CheckBox agree;

    public void goBackk(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/customerMenu.fxml"));
        Scene root2 = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(root2);
        window.show();
    }

    public void makePayment(ActionEvent event) throws IOException{
        if(agree.isSelected()==true)
        messageField.setText("Payment done successfully and data has been registered!");
        else messageField.setText("You must agree to the terms and conditions!");
    }
}
