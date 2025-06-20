package org.example;

public class main {
    public static void main(String[] args) {

//static make only one variable in the memory so if changes happen the only variable will be changed
        System.out.println("value 1 :" + teststatic.getValue());

        teststatic.setValue(20);

        System.out.println("value 2 :" + teststatic.getValue());

        System.out.println(teststatic.getValue());
    }
}
