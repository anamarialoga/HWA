package controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ControllerViewCustomers {
    public void goBackk(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("view/trainerMenu.fxml"));
        Scene newwindow=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newwindow);
        window.show();
    }

   public void send(ActionEvent event) {
     /*   JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("../HWA/src/main/resources/datastorage/premiumNames.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray companyList = (JSONArray) jsonObject.get("name");
            Iterator<JSONObject> iterator = companyList.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }catch(Exception e){
            e.printStackTrace();
        }*/
    }
}
