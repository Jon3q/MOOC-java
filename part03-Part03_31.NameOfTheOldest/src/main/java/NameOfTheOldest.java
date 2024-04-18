
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old=0;
        String s="";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] part = input.split(",");
            //String name = part[0];
            int age = Integer.valueOf(part[1]);
            if (age>old) {
                old=age;
                s = part[0];
            }
        }
        System.out.println("Name of the oldest: "+s);
    } }
