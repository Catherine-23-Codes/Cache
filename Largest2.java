// Largest elem optimal method

public class Largest2 {
    public static int  LargestElem(int[]arr, int n){
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,6,-8,-1828};
        int n=arr.length;
        int largest=LargestElem(arr,n);
        System.out.println(":The largest elem is:"+largest);
    }
}

/*
 * T.C = O(N)
 * S.C = O(1);
 */