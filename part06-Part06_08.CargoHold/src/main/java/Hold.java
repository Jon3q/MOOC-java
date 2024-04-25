import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weight){
        this.maximumWeight = weight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        int weight = this.totalWeight() + suitcase.totalWeight();
        if (weight <= maximumWeight){
            suitcases.add(suitcase);
        }
    }
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase suitacase: suitcases){
            totalWeight += suitacase.totalWeight();
        }
        return totalWeight;
    }
    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    public String toString(){
        if (suitcases.isEmpty()){
            return "no suitcases (0 kg)";
        } else if (suitcases.size() == 1){
            return suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        }
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
