
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        if (num <= 0){
            System.out.println("This number is not positive.");
        } else {
            System.out.println("This number is positive");
        }

        // Write your program here
    }
}
