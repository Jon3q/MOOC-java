
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int i = 0, j = 0, odd = 0, even = 0;
        double k = 0;
        System.out.println("Give numbers:");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0){
                i = i + num;
                j++;
                k = (double) i/j;
                if( num % 2 == 0){
                    even++;
                }else {
                    odd++;
                }
                continue;
            } else if (num <= 0 && num != -1){
                continue;
            } else {
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: " + i);

        System.out.println("Average: " + k);
        System.out.println("Numbers: " + j);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
