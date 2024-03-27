
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0){
                i = i + 1;
                continue;
            } else if (num > 0){
                continue;
            } else {
                System.out.println("Number of negative numbers: " + i);
                break;
            }
        }
    }
}
