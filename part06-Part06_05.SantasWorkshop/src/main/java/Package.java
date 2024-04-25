import java.util.ArrayList;

public class Package {

private ArrayList<Gift> gifts = new ArrayList<>();;

public Package(){
    this.gifts = new ArrayList<Gift>();
}

public void addGift(Gift gift){
    gifts.add(gift);

}

public int totalWeight(){
int weight = 0;
    for(Gift gift : gifts){
        weight = weight + gift.getWeight();
    }
    return weight;
}
}
