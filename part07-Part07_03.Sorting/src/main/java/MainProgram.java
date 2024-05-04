import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int a = array[0];

        for(int i = 0; i< array.length; i++){
            if (array[i] < a){
                a = array[i];
            }
        }
        return a;
    }
    public static int indexOfSmallest(int[] array){
        int a = array[0];
        int index = 0;
        for(int i = 0; i< array.length; i++){
            if (array[i] < a){
                a = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int a = array[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < array.length; i++){
            if (array[i] < a){
                a = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }
    public static void sort(int[] array){
       for( int i = 0; i<array.length; i++) {
           int index = indexOfSmallestFrom(array, i);
           swap(array, i, index);
           System.out.println(Arrays.toString(array));
       }
    }
}


