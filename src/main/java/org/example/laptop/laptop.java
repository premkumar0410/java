package org.example.laptop;
import org.example.laptop.components.graphic_card;
import org.example.laptop.components.processor;

public class laptop {
    private String screen;
    private processor processor;
    private int ram;
    private graphic_card graphic_card;

    public laptop(){
        this.screen = "15.6 inch";
        this.processor = new processor();
        this.ram = 16;
        this.graphic_card = new graphic_card();
    }

    public String getScreen() {
        return screen;
    }

    public processor getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public graphic_card getGraphic_card() {
        return graphic_card;
    }

    public laptop(String screen, processor processor, int ram, graphic_card graphic_card){
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.graphic_card = graphic_card;
    }

    public String toString(){
        return "laptop {" +
                " Screen = " + screen + "," +
                " processor = " + processor + "," +
                " ram = "+ ram + "," +
                " graphicscard = " + graphic_card +"}";
    }

}
