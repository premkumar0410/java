package org.example;

public class vechile {
    private String engine;
    private String fuel;
    private int seat;
//parameterized constructor
    public vechile(String engine, String fuel, int seat) {
        this.engine = engine;
        this.fuel = fuel;
        this.seat = seat;
    }

//create tostring function to get the value insead of address
    public String toString(){
        return "vechile {" +
                "engine = "+engine +
                " fule =" + fuel+
                " seat =" + seat+"}";
    }


//getters to get the value that has been in private
    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getSeat() {
        return seat;
    }
}
