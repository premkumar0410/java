package org.example;



public class main {
    public static void main(String[] args) {
        door door = new door();
        if(door.islocked("qwerty")){
            System.out.println("door is locked");
        }else{
            System.out.println("door is unlocked");
        }
    }
}
