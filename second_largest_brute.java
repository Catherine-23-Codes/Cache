public class second_largest_brute {
    public static int second_largest__number(int[] arr){
        int n=arr.length;
        int largest=arr[n-1];
        int s_largest=arr[n-2];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                s_largest=arr[i];
            } else{
                s_largest=-1;
            }
        }
        System.out.println("the largest number is:"+largest);
        // System.out.println("the second largest number is:+" s_largest);
        return s_largest;
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,7,8,3};
        int second_largest=second_largest__number(arr);
        System.out.println("the second largest number is:"+ second_largest);
        }
}
