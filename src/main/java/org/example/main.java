package org.example;



public class main {
    public static void main(String[] args) {
        if (new lock().getCode() == "12345") {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
