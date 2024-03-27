
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int k = num;
        while(k > 0){
            i = i * k;
            k--;
        }
        System.out.println(i);
    }
}
