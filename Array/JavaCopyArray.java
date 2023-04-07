import java.util.Arrays;

public class JavaCopyArray {
    public static void main(String[] args) {
        // using asignment operator
        int[] source = {1,2,3,4,5};
        // int[] destination = source;
        // for (int i : destination) {
        //     System.out.println(i);
        // }

        //using looping construct
        // int[] dest = new int[5];
        // for (int i=0; i<source.length; i++) {
        //     dest[i] = source[i];
        // }
        // System.out.println(Arrays.toString(dest));

        //using array copy() method
        //int[] dest2 = new int[source.length];
        // System.arraycopy(source, 0, dest2, 0, dest2.length);
        // System.out.println(Arrays.toString(dest2));

        //copy using copyofrange() method
        int[] dest3 = Arrays.copyOfRange(source,0,source.length);
        System.out.println(Arrays.toString(dest3));

        // copy 2d array using loop
        int[][] source3 = {
            {1, 2, 3, 4}, 
            {5, 6},
            {0, 2, 42, -4, 5}
            };
      int[][] destination = new int[source3.length][];
      for (int i = 0; i < destination.length; ++i) {
          // allocating space for each row of destination array
          destination[i] = new int[source3[i].length];
          for (int j = 0; j < destination[i].length; ++j) {
              destination[i][j] = source3[i][j];
          }
      }
      System.out.println(Arrays.deepToString(destination));
    }
}
