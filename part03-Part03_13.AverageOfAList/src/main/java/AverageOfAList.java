
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            list.add(num);
        }
        int a = 0, b = 0;
        for(int i = 0;i<list.size();i++){
            a = a + list.get(i);
            b++;
        }
        float ave = (float) a / b;
        System.out.println("Average: " + ave);
        
    }
}
