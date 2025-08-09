//Largest elem Brute force method

import java.util.*;
public class Largest1 {
    public static int LargestElem(int[]arr){

        //1.Sort the array
        Arrays.sort(arr);
        int n=arr.length;
        //2.Return the largest
        return arr[n-1];
        // always give n-1 or arr.length-1 to avoid array index out of bound.
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,7,3,0};
        int largest=LargestElem(arr);
        System.out.println("The largest elem is:"+largest);
    }
}
