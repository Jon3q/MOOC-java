
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
    }
    public static void removeLast(ArrayList<String> strings){
        int i = strings.size() - 1;
        if(i >= 0){
            strings.remove(i);
        }
    }
}
