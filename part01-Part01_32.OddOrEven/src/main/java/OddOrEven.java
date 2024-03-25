
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());

        if (num % 2 == 1){
            System.out.println("Number" + num + " is odd.");
        } else if (num % 2 == -1){
            System.out.println("Number" + num + " is odd.");
        } else {
            System.out.println("Number" + num + " is even.");
        }
    }
}
