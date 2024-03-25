
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String pass = scan.nextLine();
        String a = "Caput Draconis";
        if (pass.equals(a)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
