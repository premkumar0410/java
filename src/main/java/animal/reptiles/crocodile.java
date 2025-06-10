package animal.reptiles;
import  animal.animal;

public class crocodile extends  reptile {

    animal ani = new animal();


    public crocodile() {
        super();
        skin = "hard";


    }

    @Override
  public String toString(){
        return "crocodile " +
                super.toString();

    }
}
