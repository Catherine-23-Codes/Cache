public class second_largest_2{

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements!");
            return -1;
        }

        int largest = arr[0];
        int secondLargest = -1;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == -1) {
            System.out.println("No distinct second largest element found!");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 9, 10, 3};
        int result = findSecondLargest(arr);

        if (result != -1) {
            System.out.println("Second largest element is: " + result);
        }
    }
}

