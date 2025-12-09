import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                res=false;
                break;
            }
        }
        System.out.println(res);
    }
}
