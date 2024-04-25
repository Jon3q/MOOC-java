import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokes;
    public UserInterface(JokeManager joke, Scanner scanner){
        this.jokes = joke;
        this.scanner = scanner;
    }
    public void start(){
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String a = scanner.nextLine();
            if (a.equals("X")) {
                break;
            } else if (a.equals("1")){
                System.out.println("Write the joke to be added: ");
                String addedJoke = scanner.nextLine();
                jokes.addJoke(addedJoke);
                continue;
            } else if (a.equals("2")){
                System.out.println(jokes.drawJoke());
                continue;
            } else if (a.equals("3")){
                jokes.printJokes();
                continue;
            }
        }
    }
}
