import java.util.Arrays;

/* Implementation of Dynamic Array */

public class ImplementingArrays{

    // Array where we store all the elements
    private Object[] array;

    //Array length
    private int length;

    //Capacity of array
    private int capacity;

    //Constructor Represnting the Array 

    public ImplementingArrays(){

        array = new String[1];
        capacity = 1;
        length  = 0;
    }

    //get method

    public Object get(int index){
        return array[index];
    }

    //push method

    public int push(Object item){
        if (capacity == length){
            array = Arrays.copyOf(array,capacity*2);
            capacity *= 2;
        }

        array[length] = item;
        length++;
        return length;
    }

    //pop method - pops the last item
    
    public Object pop(){
        Object popped = array[length - 1];
        array[length - 1] = null;
        length --;
        return popped;

    }

    //delete method - deleted item at specified index
    public Object delete(int index){
        Object itemToDelete = array[index];
        shiftItems(index);
        return itemToDelete;
    }

    public void shiftItems(int index){
        for (int i = index; i < length - 1; i++){
            array[i] = array[i+1];
        }

        array[length - 1] = null;
        length --;
    }

    public static void main(String[] args){
        ImplementingArrays m = new ImplementingArrays();
        m.push("Hello");
        m.push("World");
    
        for (int i = 0; i < m.length; i++) {
          System.out.println(m.get(i));
        }

    }





    
}