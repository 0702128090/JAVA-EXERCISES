
//This code sorts numbers in descending order
import java.util.Arrays;

public class JavasortEXERCISE {
    public static void main(String[] args) {
        int[] numbers = { 4, 2, 5, 3, 1 };
        Arrays.sort(numbers);
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

    }
}
