import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLists {
    /* Arraylist increased by 50% 
       Arraylist is not syncronized 
       that means multiple thread can access a arraylist 
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
    
        System.out.println(Arrays.toString(list.toArray()));
        
    }
}
