
import java.lang.reflect.Array;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String a = scanner.nextLine();
            String[] text = a.split(" ");
            for(int i = 0; i < text.length ; i++){
                if (text[i].contains("av")){
                    System.out.println(text[i]);
                }
            }
            if(a.equals("")){
                break;
            }
        }

    }
}
