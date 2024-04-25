import java.util.ArrayList;

public class Stack {
    //private String value;
    private ArrayList<String> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(data.isEmpty()){
            return true;
        }
        return false;
    }
    public void add(String value){
        data.add(value);
    }
    public ArrayList<String> values(){
        //ArrayList<String> dataCopy = (ArrayList<String>) data.clone();
        return data;
    }
    public String take(){
        String taken = data.get(data.size()-1);
        data.remove(data.size()-1);
        return taken;
    }
}
