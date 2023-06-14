
import java.util.HashMap;
import java.util.Map;

public class charFiender {

     char FirstNonRepetativeChar(String inpString){
          Map<Character, Integer> newMap = new HashMap<>();
          var chars  = inpString.toCharArray();
          // for (char ch : chars) {
          //      if(newMap.containsKey(ch)) {
          //           var count = newMap.get(ch);
          //           newMap.put(ch, count+1);
          //      } else
          //      newMap.put(ch, 1);
          // }

          for (char ch : chars) {
               var count = newMap.containsKey(ch) ? newMap.get(ch) : 0;
               newMap.put(ch, count + 1);
          }

          for (var ch : chars) {
               if( newMap.get(ch)== 1)
               return ch;
          }
          return Character.MIN_VALUE;
     }

     public static void main(String[] args) {
          var ob = new charFiender();
          String str = "hello antor";
          char c;
          c = ob.FirstNonRepetativeChar(str);
          System.out.println(c);
          
     }
}
