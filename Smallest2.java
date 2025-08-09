// optimal 1
public class Smallest2 {
    public static int smallest_Elems(int[]arr){
        int smallest=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,-1,0,4};
        int smallest=smallest_Elems(arr);
        System.out.println("the smallest elem is:"+smallest);
    }
}
