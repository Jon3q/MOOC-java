
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        while(true) {
            String a = scanner.nextLine();
            String[] text = a.split(",");
            for (int i = 1; i < text.length; i++) {
                int c = Integer.valueOf(text[i]);
                if (c > b) {
                    b = c;
                }
            }
            if (a.equals("")) {
                break;
            }

        }
        System.out.println("Age of the oldest: " + b);

    }
}
