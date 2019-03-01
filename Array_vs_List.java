
package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Array_List {

  
    public static void main(String[] args) {
       
        //array
        int[] arr = new int [3];          //fixed size specified when declaring
        
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        //cannot add more elements to array
        
        System.out.println("Printing element on index 2 of array:");
        System.out.println(arr[2]);
        System.out.println("");
        
        //list
        List<Integer> list = new ArrayList<Integer>();          //dynamic, no fixed size
        
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        
        System.out.println("Arraylist: " + list);
        System.out.println("Array: " + Arrays.toString(arr));
        
                
        
        
        
    }
    
}
