package Java.Section2;

import java.util.ArrayList;

public class ColList {
      public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sam");
        names.add("John");
        names.add("Sara");
        names.add("Mike");
        names.add("Steve");

        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}
