
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String a = scanner.nextLine();
            if (a.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (a.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            } else if (a.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = scanner.nextLine();
                if(dictionary.translate((toBeTranslated)) == null){
                    System.out.println("Word " + toBeTranslated + " was not found");
                    continue;
                }
                System.out.println("Translation: " + dictionary.translate(toBeTranslated));
                continue;
              } else {
                    System.out.println("Unknown command");
                    continue;
                }
            }
            }
}


