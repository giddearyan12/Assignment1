public class Second{
    public static void main(String[] args){
        int arr[] = { 3, 2, 45, 65, 76, 98 };
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] <secondSmall && arr[i] !=secondSmall){
                secondSmall = arr[i];
            }
        }
        System.out.println(secondSmall);


    }
}