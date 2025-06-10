package org.example;

public class car extends vechile {
    public String steering;
    public String musicsystem;
    public String airbags;


    public car(String steering, String musicsystem, String airbags,int seat,String fule,String engine){
        super(engine,fule,seat);
        this.steering = steering;
        this.musicsystem = musicsystem;
        this.airbags = airbags;
    }

    public String toString(){
        return "car={" +
                "steering = "+steering+
                " musicsystem = "+musicsystem +
                " airbags =" +airbags+" }"+
                super.toString();
    }

}
