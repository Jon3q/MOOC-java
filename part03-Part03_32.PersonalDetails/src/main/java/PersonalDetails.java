
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        String b = "";
        while(true){
            String a = scanner.nextLine();
            String[] text = a.split(",");
            if(a.equals("")){
                break;
            }
            x = x + Integer.valueOf(text[1]);
            y++;
            String c = text[0];
            if(c.length()>b.length()){
                b = c;
            }
        }
        System.out.println("Longest name: "+b);
        System.out.println("Average of the birth years: "+(float)x/y);
    }
}
