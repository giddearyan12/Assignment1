package Java.Section2;

import java.io.FileWriter;

public class IoOp {
    public static void main(String[] args) {
        String filename ="assignment_output.txt";
        try {
            FileWriter w = new FileWriter(filename);
            w.write("Hey Hi");
            w.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
