package org.example.laptop.components;

public class graphic_card {
    private String brand;
    private int model;
    private  int memory;
    public graphic_card(){
        this.brand = "Nvidia";
        this.model = 3050;
        this.memory = 6 ;
    }

    public graphic_card(String brand, int model,int memory){
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }

    public String toString(){
        return "brand = "+brand +","+
                "model = "+model +","+
                "memory = "+memory + "}";
    }

}
