import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "antor");
        map.put(2, "Hridoy");
        map.put(5, "Sabbir");
        map.remove(2);

        String a = map.get(1);
        System.out.println(a);
        for (var item : map.entrySet()) {
            System.out.println(item);
        }
    }
}
