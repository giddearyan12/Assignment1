public class Armstrong {
    public static void main(String[] args) {
        int num = 53;
        int res = 0;
        int temp = num;
        while(num>0){
            int a = num % 10;
            res += a*a*a;
            num = num/10;
        }
        if(temp == res){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
