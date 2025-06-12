package org.example;

public class main {
    public static void main(String[] args) {
    samsung phone1 = new samsung();
    String phone1_processor = phone1.processor();
    int phone1_space = phone1.spaceingb();
    System.out.println(phone1_processor);
    System.out.println(phone1_space);


    iphone phone2 = new iphone();
    String phone2_processor = phone2.processor();
    int phone2_space = phone2.spaceingb();
    System.out.println(phone2_processor);
    System.out.println(phone2_space);
    }
}
