import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = { 2, 3, 45, 65, 76, 98 };
        int start = 0;
        int end = arr.length-1;
        int pos =-1;
        while (start <= end) {
            int mid = start+(end-start) / 2;
            if (num == arr[mid]) {
                pos=mid;
                break;
            } else {
                if (arr[mid] < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(pos);
    }
}
