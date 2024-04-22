
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a == -1){
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                break;
            }
            statistics.addNumber(a);
            if (a % 2 == 0){
                even.addNumber(a);
            } else{
                odd.addNumber(a);
            }
        }
    }
}
