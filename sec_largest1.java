import java.util.*;
public class sec_largest1 {
    public static void second_largest(int []arr){
        int n=arr.length;
        Arrays.sort(arr);
        int largest=arr[n-1];
        int s_largest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                s_largest=arr[i];
                break;
            }
        }
        if(s_largest==-1){
            System.out.println("the second largest elem if found!");
        }else{
            System.out.println("the second largest elem is:"+s_largest);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,7,0,6};
        second_largest(arr);
    }
}
