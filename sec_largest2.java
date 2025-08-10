public class sec_largest2 {
    public static void second_largest(int[] arr){
        int n=arr.length;
        int largest=arr[0];
        int second_largest=-1;
        for(int num:arr){
            if(num >largest){
                second_largest=largest;
                largest=num;
            }else if(num>second_largest && num!=largest){
                second_largest=largest;
            }
        }
        if(second_largest==-1){
            System.out.println("there's no distinct elem found!");
        }else{
            System.out.println("the second largest elem is:"+second_largest);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,9,2,5,0,4};
        second_largest(arr);
    }
}
