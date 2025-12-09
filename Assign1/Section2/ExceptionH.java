package Java.Section2;

public class ExceptionH {
    public static void main(String[] args) {
        try {
            int x = 1;
            int y = 0;
            int res = x / y;
            System.out.println(res);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
