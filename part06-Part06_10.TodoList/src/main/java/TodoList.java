import java.util.ArrayList;


public class TodoList {


    private ArrayList<String> list;
    public TodoList(){
        this.list = new ArrayList<>();
    }
    public void add(String task){
        list.add(task);
    }

    public void print(){
        for(int index = 0; index < list.size(); index ++){
        String a = list.get(index);
        System.out.println(index+1 + ": " + a);
        }

    }

    public void remove(int number){
        list.remove(number - 1);
    }
}
