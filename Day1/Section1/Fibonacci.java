public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;
        int t1 = 0;
        int t2 = 1;
        int next = t1+t2;

        for(int i=3;i<num;i++){
            t1=t2;
            t2=next;
            next=t1+t2;
        }
        System.out.println(next);
    }
}
