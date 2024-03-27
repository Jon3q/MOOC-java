
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num != 0){
                i = i + 1;
                j = j + num;
                continue;
            } else {
                System.out.println("Number of numbers: " + i);
                System.out.println("Sum of the numbers: " + j);
                break;
            }
        }

    }
}
