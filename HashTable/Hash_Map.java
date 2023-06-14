import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer, String> newHasMap = new HashMap<>();
        newHasMap.put(1, "Antor");
        newHasMap.put(2, "tanim");
        newHasMap.put(4, "hello");
        newHasMap.put(3, "jack");
        newHasMap.put(6, "kaka"); // store key and value pair in map
        System.out.println(newHasMap);
        newHasMap.put(null, "null"); // map can store null key and value
        newHasMap.put(3, "zidan"); // overwrite the value
        newHasMap.remove(6); // remove the key value pair
        newHasMap.containsKey(1); // O(1) returns a bool
        newHasMap.containsValue("newHasMap"); // O(n) checks all the values in map returns a bool
        System.out.println(newHasMap);
        String value = newHasMap.get(2); // takes key and returns a string
        System.out.println(value);
        // can't iterate over HashMap we can use entySet() or keySet()
        for (var item : newHasMap.entrySet()) {
            System.out.println(item.setValue(value));
        }

    }
}
