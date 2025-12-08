package Java.Section2;
import java.util.HashMap;

public class ColMap {
        public static void main(String[] args) {
        
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");

        for (String country : capitals.keySet()) {
            String capital = capitals.get(country);
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
    }
    
}
