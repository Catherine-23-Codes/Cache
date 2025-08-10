import java.util.Arrays;

public class s_largest1 {
    public static void second_largest(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array must have at least 2 elements!");
            return;
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        int largest = arr[n - 1];
        int second_largest = -1;

        // Step 2: Find the second largest distinct element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                second_largest = arr[i];
                break; // stop after finding it
            }
        }

        if (second_largest == -1) {
            System.out.println("No distinct second largest element found!");
        } else {
            System.out.println("The second largest element is: " + second_largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 8, 14, 18};
        second_largest(arr);
    }
}
