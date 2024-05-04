
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container container = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container.contains() + "/100");
            System.out.println("Second: " + container2.contains() + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                container.add(amount);
            } else if (command.equals("move")){
                if (container.contains() > 0){
                    if (container.contains() >= amount){
                        if (container2.contains() + amount <= 100) {
                            container.remove(amount);
                            container2.add(amount);
                        } else if (container2.contains() + amount >= 100) {
                            container.remove(amount);
                            container2.add(amount);
                        }
                    } else if (container.contains() < amount) {
                        if (container2.contains() + amount <= 100) {
                            container2.add(container.contains());
                        } else {
                            container2.add(amount);
                        }
                        container.remove(amount);
                    }
                }
            } else if (command.equals("remove")) {
                container2.remove(amount);
            } else {
                continue;
            }
        }
    }

}
