import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int k;
        System.out.println("Enter the K value");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        k = k % num.length;

        reverse(num, 0, num.length - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, num.length - 1);
        System.out.println(Arrays.toString(num));
        input.close();
    }
    // using reversing the array
    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
