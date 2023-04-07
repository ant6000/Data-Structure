import java.util.Arrays;

/*
 *  reverse an array of characters 
 * in place using constant O(1) extra memory:
 */

public class ReverseArray {
    public static void main(String[] args) {
        //char[] s = {'a','n','t','o','r'};
        int [] a = { 1,2,3,4,5,5,6};

        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }

    private static void reverseArray(int[] a) {
        int i = 0 ;
        int j = a.length - 1;
        while(i < j){
            // Swap the characters at indices i and j
            int temp  = a[i];
            a[i] = a[j];
            a[j] = temp;
            // Move the indices closer to each other
            i++;
            j--;
        }

    }
}
