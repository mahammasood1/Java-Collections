
package hashset_sortedset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class HashSet_SortedSet {

   
    public static void main(String[] args) {
       
        //hashset
        HashSet<String> hs = new HashSet<>();
        
        hs.add("First element");
        hs.add("Second element");
        hs.add("Third element");
        hs.add(null);            //allows null insertion
                   
        System.out.println("Printing HashSet elements:");         //order not maintained
        System.out.println(hs);
        System.out.println("");
        
        //sortedset
        SortedSet<String> ss = new TreeSet<>();
        
        ss.add("First element");
        ss.add("Second element");
        ss.add("First element");                   //duplicate entry
        ss.add("Third element");
        //ss.add(null);                           //null pointer exception
        
        System.out.println("Printing SortedSet elements:");     //order maintained
        System.out.println(ss);
        
    }
    
}
