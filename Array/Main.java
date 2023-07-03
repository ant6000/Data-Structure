import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "abc");
        myMap.put(1, "def");
        myMap.put(1, "asdsbc");
        myMap.put(1, "xyz");
        myMap.put(2, "xyz");

        System.out.println(myMap.toString());
    }
}
