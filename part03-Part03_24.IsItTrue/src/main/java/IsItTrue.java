
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = String.valueOf(scanner.nextLine());
        String b = "true";
        if (a.equals(b)){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
