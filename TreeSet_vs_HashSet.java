
package treeset_hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet_HashSet {

  
    public static void main(String[] args) {
       
        //treeset
        TreeSet<String> ts = new TreeSet<String>();
        
        
        ts.add("First element");
        ts.add("Second element");
        ts.add("Third element");
        //ts.add(null);               //throws null pointer exception

        ts.add("First element");      //duplicate removed
        
        System.out.println("Printing TreeSet elements:");
        System.out.println(ts);
        System.out.println("");

        
        //hashset
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("First element");
        hs.add("Second element");
        hs.add("Third element");
        hs.add(null);                //allows null insertion
        
        hs.add("First element");    //duplicate removed

        System.out.println("Printing HashSet elements:");
        System.out.println(hs);
 
        
    }
    
}
