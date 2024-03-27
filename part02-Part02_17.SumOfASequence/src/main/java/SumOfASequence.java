
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, j = 0;
        System.out.println("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());
        while(i <= num){
            j = j + i;
            i++;
        }
        System.out.println("The sum is " + j);
    }
}
