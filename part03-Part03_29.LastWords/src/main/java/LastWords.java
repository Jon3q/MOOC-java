
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String a = scanner.nextLine();
            String[] text = a.split(" ");
            if(a.equals("")){
                break;
            }
            System.out.println(text[text.length - 1]);
        }

    }
}
