
public class AdvancedAstrology {

    public static void printStars(int number) {
        while(number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while(number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i < size + 1){
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = height, j = 1;
        while(i > 0){
            printSpaces(i-1);
            printStars(j);
            j=j+2;
            i--;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
