
import java.util.ArrayList;


public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String listOfElements = "";

        for (int a = 0; a < elements.size();a++) {
            if (a == elements.size() - 1){
                listOfElements = listOfElements + elements.get(a);
                break;
            }
            listOfElements = listOfElements + elements.get(a) + "\n";
        }



        if(elements.size()>1) {
            return "The collection " + this.name + " has " + elements.size() +" elements:\n"+listOfElements;
        } else if (elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        return "The collection " + this.name + " has " + elements.size() +" element:\n" + listOfElements;
        }
    }

