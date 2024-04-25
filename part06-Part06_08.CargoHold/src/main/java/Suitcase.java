import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    public void addItem(Item item){
        int totalWeight = 0;
        if(items.isEmpty()) {
            if (item.getWeight() <= this.maximumWeight) {
                items.add(item);
            }
        } else {
            items.add(item);
            if(this.totalWeight() >= this.maximumWeight) {
                items.remove(item);
            }
        }
    }
    public String toString(){
        if (items.size() > 1) {
            return items.size() + " items (" + this.totalWeight() + " kg)";
        } else if (items.size() == 1){
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return "no items (0 kg)";
        }
    }

    public void printItems() {
        for (Item item: items){
            System.out.println(item);
        }

//        String listOfElements = "";
//
//        for (int a = 0; a < suitcases.size(); a++) {
//            if (a == suitcases.size() - 1) {
//                listOfElements = listOfElements + suitcases.get(a);
//                break;
//            }
//            listOfElements = listOfElements + suitcases.get(a) + "\n";
//        }
//        return listOfElements;
    }
    public int totalWeight(){
        int totalWeight = 0;
        for(Item weightItem : items){
            totalWeight += weightItem.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }
        Item returnObject = this.items.get(0);
        for (Item item: this.items) {
            if (returnObject.getWeight() < item.getWeight()) {

                returnObject = item;
            }
        }
        return returnObject;
    }

}
