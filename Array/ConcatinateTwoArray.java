import java.util.Arrays;

public class ConcatinateTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 =  {4,5,6};
        int[] result = new int[array1.length + array2.length];
        //System.arraycopy(array1, 0, result, 0, array1.length);
        //System.arraycopy(array2, 0, result, array1.length, array2.length);
        //System.out.println(Arrays.toString(result));


        // without using arraycopy
        int position = 0;
        for (int i : array1) {
            result[position] = i;
            position++;
        }
        for (int i : array2) {
            result[position] = i;
            position++;
        }
        System.out.println(Arrays.toString(result));
    }
}
