package Java.Section2;

public class staticK {
    public static int count = 0;

    public staticK(){
        count++;
    }
    public static void main(String[] args) {
        staticK s = new staticK();
    }
}
