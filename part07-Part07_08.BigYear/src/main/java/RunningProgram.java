import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RunningProgram {
    private Scanner scanner;
    private ArrayList<Birds> birdList;
    private HashMap<Birds, Integer> observations;

    public RunningProgram(Scanner scanner, ArrayList<Birds> birdList){
        this.scanner = scanner;
        this.birdList = birdList;
        this.observations = new HashMap<>();
    }
    public void start(){
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            if (command.equals("Quit")){
                break;
            }
            if (command.equals("Add")){
                addNew();
            }
            if (command.equals("Observation")){
                observe();
            }
            if (command.equals("All")){
                show();
            }
            if (command.equals("One")){
                showOne();
            }

        }

    }

    public void showOne(){
        System.out.println("Bird? ");
        String searchedOne = scanner.nextLine();
        for (Birds bird : birdList) {
            if (bird.getName().equalsIgnoreCase(searchedOne)) {
                int count = observations.getOrDefault(bird, 0); // Get observation count for the bird
                System.out.println(bird.toString() + count + " observations");
                return; // Exit the method after finding and printing the bird
            }
        }
        System.out.println("Bird not found.");
    }

    public void show(){
        for (Birds birds : birdList){
            int count = observations.getOrDefault(birds, 0); // Get observation count for the bird
            System.out.println(birds.toString() + count + " observations" );
        }
    }

    public void observe(){
        System.out.println("Bird? ");
        String observed = scanner.nextLine();
        for (Birds bird : birdList) {
            if (bird.getName().equalsIgnoreCase(observed)) {
                observations.put(bird, observations.getOrDefault(bird, 0) + 1); // Increment observation count
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void addNew(){
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();
        if (!name.isEmpty() && !latinName.isEmpty()){
            Birds newBird = new Birds(name, latinName);
            birdList.add(newBird);
            observations.put(newBird, 0); // Initialize observation count for the new bird
        }
    }
    public ArrayList<Birds> getBirdList(){
        return birdList;
    }
}
