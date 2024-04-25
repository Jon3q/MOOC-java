import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String a = scanner.nextLine();
            if (a.equals("stop")) {
                break;
            } else if (a.equals("add")){
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                list.add(toAdd);
                continue;
            } else if (a.equals("list")) {
                list.print();
                continue;
            } else if (a.equals("remove")) {
                System.out.println("which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                list.remove(toRemove);
                continue;
            }
        }
    }
}
