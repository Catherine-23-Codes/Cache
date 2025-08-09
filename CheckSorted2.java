public class CheckSorted2 {
    public static boolean isSorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6,7,8};
        //int[] arr={1,1,1,1,1,1,1,1};
       // int[] arr={11,9,6,3,1};
       //int[] arr={-3,-1,0,1,65};
      // int[] arr={-1,-2,-3,-5,-6};
        if(isSorted(arr)){
            System.out.println("Array is sorted!");
        }else{
            System.out.println("Array is not sorted!");
        }
    }
}
