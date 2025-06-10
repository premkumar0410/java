package org.example;

public class car {
    public int speed;
    private int doors;
    private String engine;
    private String drive;

    public car(int speed ,int doors,String engine , String drive){
        this.speed = speed;
        this.doors = doors;
        this.engine = engine;
        this.drive = drive;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void run(){
        if(speed > 0 && drive.equals("Driving") && engine.equals("on")&&doors == 4){
            System.out.println("car is running");
        }else{
            System.out.println("car is not running");
        }
    }

}
