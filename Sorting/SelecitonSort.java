public class SelecitonSort {
    public void sort(int[] array){
        for(int i = 0 ; i < array.length; i++){
            int minIndex = i;
            for(int j = i ; j < array.length; j++){
                if(array[j] < array[minIndex])
                minIndex = j;
                swap(array, minIndex, i);
            }
        }
    }
    public void swap(int[] a , int index1, int index2){
            var temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
}
