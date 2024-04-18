
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int a, b;
        for(int i = 0; i < array.length; i++){
            a = array[i];
            for(b = 0; b < a; b++ ){
                System.out.print("*");
                if (b == a - 1){
                    System.out.println();
                }

            }
        }
    }

}
