public class MergeSort {
    public void mergesort(int[] array){
        int inputLength = array.length;
        
        if(inputLength < 2)
        return;

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++)
            leftHalf[i] = array[i];

        for(int j = midIndex; j < inputLength; j++)
            rightHalf[j - midIndex] = array[j];

        mergesort(leftHalf);
        mergesort(rightHalf);
        merge(array,leftHalf,rightHalf);

    }

    public void merge( int[] inputArray, int[]leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int RightSize = rightArray.length;
        int i = 0, j = 0 , k = 0;

        while(i< leftSize && j< RightSize){
            if(leftArray[i] < rightArray[j]){
                inputArray[k] = leftArray[i];
                i++;
            }
            else{
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < RightSize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
