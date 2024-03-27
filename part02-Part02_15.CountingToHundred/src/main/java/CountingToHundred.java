
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = Integer.valueOf(scanner.nextLine());
        while(j <= 100){
            System.out.println(j);
            j++;
        }
    }
}
