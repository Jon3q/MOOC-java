
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        int i = Integer.valueOf(scanner.nextLine());
        for(int a = 0; a<list.size(); a++){
            int num = list.get(a);
            if (num == i){
                System.out.println(i +" is at index " + a);
            }
        }


        // implement here finding the indices of a number
    }
}
