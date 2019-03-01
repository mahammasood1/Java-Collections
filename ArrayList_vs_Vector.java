
package arraylist_vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList_Vector {

   
    public static void main(String[] args) {
        
        
        //arraylist
        ArrayList<String> arrlist = new ArrayList<>();
        
        arrlist.add("Hello");
        arrlist.add("World");
        
        System.out.println("Printing Arraylist elements:");
             
        Iterator iterator = arrlist.iterator(); 
        
        while (iterator.hasNext()) 
            System.out.println(iterator.next()); 
  
        System.out.println("");
       
        //vector
        Vector <String> vec = new Vector<String>(); 
        
        vec.addElement("Vector1"); 
        vec.addElement("Vector2"); 
     
        System.out.println("Printing Vector elements:"); 
        
        Enumeration en = vec.elements(); 
        
        while (en.hasMoreElements()) 
            System.out.println(en.nextElement()); 
        
    }
    
}
