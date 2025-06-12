package org.example;

public class main {
    public static void main(String[] args) {
    person male = new male();
    male.gender();
    male.speak();
        System.out.println("-------------------------------------------------");
    person female;
    female = new female();
    female.speak();
    female.gender();
        System.out.println("------------------------------------------------");
    person p1 = new person() {

        public void gender() {
            System.out.println("male");
        }
    };

    p1.gender();
    p1.speak();

    }
}
