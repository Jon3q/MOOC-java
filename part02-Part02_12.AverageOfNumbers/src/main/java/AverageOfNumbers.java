
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        double ave = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num != 0){
                i = i + 1;
                j = j + num;
                ave =(double) j/i;
                continue;
            } else {
                System.out.println("Average of the numbers: " + ave);
                break;
            }
        }
    }
}
