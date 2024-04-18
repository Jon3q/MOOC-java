
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        printNumbersInRange(numbers, 0, 10);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        int a;
        for ( int i = 0; i < numbers.size(); i++){
            a = numbers.get(i);
            if(a >= lowerLimit && a <= upperLimit){
                System.out.println(a);
            }
        }
    }
}
