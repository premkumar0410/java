package org.example;

public class main {
    public static void main(String[] args) {
        inner_class.innerclass.inner();
        System.out.println(inner_class.innerclass.x);

        inner_class nc = new inner_class();
        inner_class.nonstaticclass nsc = nc.new nonstaticclass();
        nsc.nonstatic();





    }
}