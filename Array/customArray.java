public class customArray {

    //custom dynamic array it can grow and srink autometically
    //insert item insert()
    //remove item removeAt(index)
    //index of an item indexOf(index)
    //print the array print()

    public int[] items;
    public int count = 0;
    // constractor creates the aarray
    public customArray(int length){
        items  = new int[length];
    }

    //this method is for inserting an item into array
    public void insert(int item){
        reSizeifRequired();
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int j = index; j < count; j++)
         items[j] = items[j+1];
        
        count--;
    }

    public int indexOf(int item){
        for(int i =0; i < count; i++)
         if(items[i] == item)
         return i; 

        return -1;
    }

    private void reSizeifRequired(){
        if(items.length == count){
            int[] newArray = new int[count * 2];
            // coppying all items from old array into new array
            for (int i = 0; i < count; i++)
             newArray[i] = items[i];

            items = newArray;
        }
    }

    //this method is for printing the array
    public void print(){
        for(int i = 0; i < count; i++)
        System.out.print(items[i] +" ");
    }
}
