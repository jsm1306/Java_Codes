import java.util.Map;
import java.util.TreeMap;

public class TreeMaPExample {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("Laptop", 60000.00);
        map.put("Samsung Galaxy S7", 69000.00);
        map.put("Samsung Galaxy S8", 67000.00);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
