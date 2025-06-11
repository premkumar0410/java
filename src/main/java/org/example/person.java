package org.example;

public class person {
    private String name;
    private int age ;
    private char gender;

    public person(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >0 && age <= 100){
            this.age = age;
        }

    }

    public String toString(){
        return "person " +
                " name " + name+","+
                " age " + age +","+
                " gender " + gender;
    }
}
