
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        double ave = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num != 0 && num > 0){
                i = i + 1;
                j = j +num;
                ave = (double) j/i;
                continue;
            } else if (num != 0 && num < 0) {
                continue;
            } else if (num == 0 && i == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }  else {
                System.out.println(ave);
                break;
            }
        }
    }
}
