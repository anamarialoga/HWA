package model;

import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;

public class Exercise {


    private SimpleStringProperty monday,tuesday, wednesday, thursday, friday, saturday, sunday;



    
    public Exercise(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
        this.monday=new SimpleStringProperty(monday);
        this.tuesday = new SimpleStringProperty(tuesday);
        this.wednesday = new SimpleStringProperty(wednesday);
        this.thursday=new SimpleStringProperty(thursday);
        this.friday=new SimpleStringProperty(friday);
        this.saturday=new SimpleStringProperty(saturday);
        this.sunday=new SimpleStringProperty(sunday);
    }


    public String getMonday() { return monday.get(); }
    public void setMonday(String monday) { this.monday= new SimpleStringProperty(monday); }


    public String getThursday() { return thursday.get(); }
    public void setThursday(String thursday) { this.thursday=new SimpleStringProperty(thursday); }


    public String getFriday() { return friday.get(); }
    public void setFriday(String friday) { this.friday= new SimpleStringProperty(friday); }


    public String getSaturday() { return saturday.get(); }
    public void setSaturday(String saturday) { this.saturday=new SimpleStringProperty(saturday); }


    public String getSunday() { return sunday.get(); }
    public void setSunday(String sunday) { this.sunday= new SimpleStringProperty(sunday); }


    public String getFirstName() { return tuesday.get(); }
    public void setFirstName(String firstName) {
        this.tuesday = new SimpleStringProperty(firstName);
    }


    public String getLastName() { return wednesday.get(); }
    public void setLastName(String lastName) {
        this.wednesday = new SimpleStringProperty(lastName);
    }




    public String toString()
    {
        return String.format("%s %s %s %s %s %s %s",monday, tuesday, wednesday, thursday, friday, saturday, sunday);
    }
}
