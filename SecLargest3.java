public class SecLargest3 {
    public static int second_largest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second_largest = largest;
                largest = num;
            } else if (num > second_largest && num != largest) {
                second_largest = num;
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("There's no second largest element!");
            return -1;
        }

        return second_largest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 3, 5, 7, 0, -1, -55};
        int s_largest = second_largest(arr);
        if (s_largest != -1) {
            System.out.println("The second largest element is: " + s_largest);
        }
    }
}
