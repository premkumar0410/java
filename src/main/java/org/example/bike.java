package org.example;


public class bike extends vechile {
    public String handle;



    public bike(String fuel,int seat,String engine,String handle){
        super(engine,fuel,seat);
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}
