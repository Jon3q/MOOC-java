
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        int i = 0;
        int wins = 0;
        int loses = 0;

        try (Scanner scanTeams = new Scanner(Paths.get(file))){
            while(scanTeams.hasNextLine()){
                String row = scanTeams.nextLine();
                String[] info = row.split(",");
                int a = Integer.valueOf(info[2]);
                int b = Integer.valueOf(info[3]);

                if(info[0].equals(team) || info[1].equals(team)){
                    i++;
                }
                if(info[0].equals(team) && a>b || info[1].equals(team) && b>a){
                    wins++;
                }
                if(info[0].equals(team) && b>a || info[1].equals(team) && a>b){
                    loses++;
                }
            }
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        System.out.println("Games: "+i);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+loses);
    }

}
