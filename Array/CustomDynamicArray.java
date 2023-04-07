public class CustomDynamicArray {
    private int[] items;
    public int count;
    public CustomDynamicArray(int length){
        items = new int[length];
    }
    public void insert(int item){
        // if the array if full
        if ( items.length == count ){
            //create a new array twice the size
            int[] newitems = new int[count * 2];
            // copy all the items 
            for( int i = 0; i < count; i++ )
                newitems[i] = items[i];
            
            items = newitems;
        }
        items[count++] = item;
    }
    public void removeAt( int index){
        if ( index < 0 || index >= count )
            throw new IllegalArgumentException();

            for ( int i = index; i < count; i++ )
                items[i] = items[i+1];
                count--;
    }
    public int indexOf(int item) {
        for( int i = 0; i < count; i++ )
            if ( items[i] == item )
            return i;
             
        return -1;
    }

    public void print(){
        for ( int i = 0; i< count; i++){
            System.out.print(items[i]+ " ");
        }
    }
}
