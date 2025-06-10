package animal.reptiles;
import  animal.animal;
public class reptile extends animal {
    protected String skin;
    protected boolean backbone;

    public reptile() {
        super();
        animaltype = "reptile";
        leg = 4;
        flyable = false;
        walkable = true;
        this.backbone = true;
        this.skin = "hard";
    }

    public String toString(){
        return "Reptiles " +
                "animalType =" + animaltype +
                "leg = " +leg +
                "flyable = " + flyable +
                "walkable =" + walkable +
                "backbone =" + backbone +
                "skin = " + skin +
        "}";
    }
}
