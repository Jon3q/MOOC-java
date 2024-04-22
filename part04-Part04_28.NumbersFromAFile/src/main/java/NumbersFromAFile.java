
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int i = 0;
        try (Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                int a = Integer.valueOf(scan.nextLine());
                if(a>=lowerBound && a<=upperBound){
                    i++;
                }
            }
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        System.out.println("Numbers: "+i);
    }

}
