// smallest elem in an array-Brute force

import java.util.*;
public class Smallest1 {
    public static int smallest_Elem(int[]arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr={1,25,6,2,8,49,0,-3};
        int smallest=smallest_Elem(arr);
        System.out.println("the smallest elem is:"+smallest);
    }
}
