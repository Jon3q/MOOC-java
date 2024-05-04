import java.util.ArrayList;

public class Birds {
    private String name;
    private String latinName;

    public Birds(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public String getName(){
        return name;
    }
    public String getLatinName(){
        return latinName;
    }
    public String toString(){
        return name + " (" + latinName + "): ";
    }
}
