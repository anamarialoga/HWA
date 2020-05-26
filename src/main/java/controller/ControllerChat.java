package controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.NoUsernameGiven;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Message;
import model.PremiumName;
import service.MessageService;

import java.awt.*;
import java.io.*;
import java.util.List;

public class ControllerChat {

    @FXML
    public TextField Message;
    @FXML
    public Text messageSent,checkMessages;

    public void goBackk(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/trainerMenu.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }

    public void sendCustomer(ActionEvent event) {
        try{

            MessageService.addMessage(Message.getText());
            messageSent.setText("Your message has been sent");

        } catch ( NoUsernameGiven e) {

            messageSent.setText(e.getMessage());
            Alert alert=new Alert(Alert.AlertType.WARNING, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
            if(alert.getResult()==ButtonType.OK)
                alert.close();
        }
    }

    public void checkNewMessage(ActionEvent event) {
        try {
            String aux="";
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("../HWA/src/main/resources/datastorage/chat.json"));
            TypeReference<java.util.List<Message>> typeReference = new TypeReference<java.util.List<Message>>() {};
            List<Message> names = mapper.readValue(inputStream,typeReference);
            for(Message n : names){
               // System.out.println("name " + n.getName());
              //  aux=aux+n.getName();
               // aux=aux+"\n";
                checkMessages.setText(n.getMessage());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
