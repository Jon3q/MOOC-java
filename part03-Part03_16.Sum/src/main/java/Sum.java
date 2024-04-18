
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(sum(numbers));
    }
    public static int sum(ArrayList<Integer> numbers){
        int a = 0;
        for(int i = 0; i < numbers.size(); i++){
            a = a + numbers.get(i);
        }
        return a;
    }
}
