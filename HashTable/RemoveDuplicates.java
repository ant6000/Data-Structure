import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //String sentence = "hello i'm  antor";

        var ch = FirstNonRepetetiveCharacter(array);
        System.out.println(ch);
    }

    public static boolean FirstNonRepetetiveCharacter(int[] str){
        Map<Integer, Integer> map = new HashMap<>();
        //var chars = str.toCharArray();
        for(var ch: str){
        var count = map.containsKey(ch) ? map.get(ch) : 0;
        map.put(ch, count + 1);
        }
        for(var ch : str){
            if(map.get(ch)> 1)
            return true;
        }

        return false;
    }
}