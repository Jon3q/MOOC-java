
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int first =  Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int last =  Integer.valueOf(scanner.nextLine());
        int i = 0, j = first, k = 0;
        while(i <= last-first){
            k = k + j;
            j++;
            i++;
        }
        System.out.println(k);
    }
}
