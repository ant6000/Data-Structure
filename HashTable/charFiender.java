
import java.util.HashMap;
import java.util.Map;
// return first non repetative character from a strin
// public class charFiender {


//      char FirstNonRepetativeChar(String inpString){
//           Map<Character, Integer> newMap = new HashMap<>();
//           var chars  = inpString.toCharArray();
//           // for (char ch : chars) {
//           //      if(newMap.containsKey(ch)) {
//           //           var count = newMap.get(ch);
//           //           newMap.put(ch, count+1);
//           //      } else
//           //      newMap.put(ch, 1);
//           // }

//           for (char ch : chars) {
//                var count = newMap.containsKey(ch) ? newMap.get(ch) : 0;
//                newMap.put(ch, count + 1);
//           }

//           for (var ch : chars) {
//                if( newMap.get(ch)== 1)
//                return ch;
//           }
//           return Character.MIN_VALUE;
//      }

//      public static void main(String[] args) {
//           var ob = new charFiender();
//           String str = "hello antor";
//           char c;
//           c = ob.FirstNonRepetativeChar(str);
//           System.out.println(c);
          
//      }
// }


class abc{
     char charFinder(String inpString){
          Map<Character, Integer> myMap = new HashMap<>();
          var chars = inpString.toCharArray();

          for (var items : chars) {
               if(myMap.containsKey(items)){
                    int count = myMap.get(items);
                    myMap.put(items, count + 1);
               }else{
                    myMap.put(items, 1);
               }
          }

          for (var c : chars) {
               if(myMap.get(c) == 1)
               return c;
          }
          return 0;
     }


     public static void main(String[] args) {
          var ob = new abc();
          var ck = ob.charFinder("a ggreen apple");
          System.out.println(ck);
     }
}