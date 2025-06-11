package org.example;

import org.example.laptop.components.processor;
import org.example.laptop.components.graphic_card;
import org.example.laptop.laptop;
public class Main{
    public static void main(String[] args) {
        processor p1 = new processor();
        graphic_card g1 = new graphic_card();

        laptop laptop = new laptop("15.4", p1, 8,g1);

        System.out.println(laptop);


    }
}