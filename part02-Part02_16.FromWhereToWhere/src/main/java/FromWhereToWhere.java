
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int j = Integer.valueOf(scanner.nextLine());
        while(j <= i){
            System.out.println(j);
            j++;
        }
        // Write your program here
    }
}
