import java.util.*;

public class Array {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = { 1,5,3,7,9,0 };

        System.out.println(getLargest(numbers));
    }
}