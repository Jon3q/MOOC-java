
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String a = scanner.nextLine();
            if (a.equals("end")){
                break;
            }
            int x = Integer.valueOf(a)*Integer.valueOf(a)*Integer.valueOf(a);
            System.out.println(x);
        }
    }
}
