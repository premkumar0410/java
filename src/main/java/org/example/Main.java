package org.example;
public class Main{
    public static void main(String[] args) {
        car car = new car();
        car.setDoors(4);
        car.setEngine("V12 engine");
        car.setDrive("Is Driving");
        System.out.println(car.getDoors());
        System.out.println(car.getDrive());
        System.out.println(car.getEngine());
    }
}