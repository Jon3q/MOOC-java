
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points total, -1 stops: ");
        int sum = 0, i = 0, passingSum = 0, j = 0, grade0 = 0, grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            if(num >= 0 && num <= 100){
                sum += num;
                i++;
                if (num < 50){
                    grade0++;
                } else if (num < 60){
                    grade1++;
                } else if (num < 70){
                    grade2++;
                } else if (num < 80){
                    grade3++;
                } else if (num < 90){
                    grade4++;
                } else if (num <= 100){
                    grade5++;
                }
            }
            if (num >= 50 && num <= 100){
                passingSum += num;
                j++;
            }
        }


        double ave = (double) sum/i;
        double passingAve = (double) passingSum/j;
        double percentagePassing = 100.0 * j / i;
        System.out.println("Point average (all): " + ave);
        if (passingSum > 0){
            System.out.println("Point average (passing): " + passingAve);
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + percentagePassing);
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            if (grade == 0){
                for (int stars = 0; stars<grade0; stars++){
                    System.out.print("*");
                }
            } else if (grade == 1){
                for (int stars = 0; stars<grade1; stars++){
                    System.out.print("*");
                }
            } else if (grade == 2){
                for (int stars = 0; stars<grade2; stars++){
                    System.out.print("*");
                }
            } else if (grade == 3){
                for (int stars = 0; stars<grade3; stars++){
                    System.out.print("*");
                }
            } else if (grade == 4){
                for (int stars = 0; stars<grade4; stars++){
                    System.out.print("*");
                }
            } else if (grade == 5){
                for (int stars = 0; stars<grade5; stars++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
