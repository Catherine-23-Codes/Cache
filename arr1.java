class arr1 {
    public static int LinearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {1, 6, 2, 8, -2, 48, 67};
        int key = 8;
        int result = LinearSearch(arr, key);
        if (result == -1) { // fixed condition
            System.out.println("Element not found!");
        } else {
            System.out.println("Element is found at position: " + result);
        }
    }
}
