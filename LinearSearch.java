public class LinearSearch {
    public static int LinearSearchArr(int[] arr, int target,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,64,7,9,24,72};
        int target=7;
        int index=LinearSearchArr(arr, target, target);
        if(index!=-1){
            System.out.println("The target " +target+ " is found at position:"+index );
        }else{
            System.out.println("the target"+ target+" is not found at all! ");
        }
    }
}

/*
Best case: Target is found at the first index → O(1)

Worst case:
 Target is at the end (or not present at all) → You check all n elements → O(n)

 ✅ TC:

Best case → O(1)
Worst case → O(n)


✅ SC: O(1)
No extra data structures.
 * 
 */