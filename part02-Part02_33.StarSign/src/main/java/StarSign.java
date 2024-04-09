
public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(10);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 0, j = 0;
        while (i < size) {
            while (j < size) {
                System.out.print("*");
                j++;
            }
            j = 0;
            i++;
            if (i == size) {
                break;
            } else {
                System.out.println("");
                continue;
            }
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0, j = 0;
        while (i < height) {
            while (j < width) {
                System.out.print("*");
                j++;
            }
            j = 0;
            i++;
            if (i == height) {
                break;
            } else {
                System.out.println("");
                continue;
            }
        }
    }

    public static void printTriangle(int size) {
        int i = 0, j = size - 1;
        while (i < size) {
            while (j < size) {
                System.out.print("*");
                j++;
            }
            i++;
            j = j - i - 1;
            if (i == size) {
                break;
            } else {
                System.out.println("");
                continue;
            }
        }
    }
}
