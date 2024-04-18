
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999){
                break;
            }else{
                list.add(num);
                continue;
            }
        }
        int a = list.get(0);
        for(int i = 0; i<list.size();i++){
            int b = list.get(i);
            if(b < a){
                a = b;
            }
        }
        System.out.println("Smallest number: "+ a);
        System.out.println("Found at index: "+ list.indexOf(a));

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
