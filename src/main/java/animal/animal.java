package animal;

public class animal {
    protected String animaltype ;
    protected int leg;
    protected boolean flyable;
    protected boolean walkable;

    public animal(){
        this.animaltype = "un";
        this.leg = 0;
        this.flyable =false;
        this.walkable = false;
    }




    public String toString(){
        return "Animal = {" +
                "animaltype ="+ animaltype +
                "leg = " +leg +
                "flyable = " + flyable +
                "walkable = "+ walkable + "}";
    }
}

