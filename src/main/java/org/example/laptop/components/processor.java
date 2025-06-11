package org.example.laptop.components;

public class processor {
    private String brand;
    private int memory;
    private int core;
    private int thread;

    public processor(){
        this.brand = "intel";
        this.memory = 6;
        this.core = 8;
        this.thread = 16;
    }

    public processor(String brand,int memory , int core, int thread){
        this.brand = brand;
        this.memory = memory;
        this.core = core;
        this.thread = thread;
    }

    public String getBrand(){
        return  brand;
    }

    public int getMemory(){
        return memory;
    }

    public int getCore(){
        return core;
    }

    public int getThread(){
        return  thread;
    }

    public String toString(){
        return "brand = " + brand + "," +
                "memory = "+ memory + ","+
                "core = "+memory +","+
                "thread = "+thread +"}";
    }
}
