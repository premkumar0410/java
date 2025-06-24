package org.example;

public class inner_class {
    // static inner class
    public static class innerclass{
        public static int x = 10;
        public static void inner(){
            System.out.println("hello inner class");
        }
    }

    public class nonstaticclass{
        public int x = 10;
        public void nonstatic(){
            System.out.println("hello non static");
        }
    }

}
