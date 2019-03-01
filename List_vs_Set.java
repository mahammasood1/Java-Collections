
package list_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class List_Set {

    public static void main(String[] args) {
        
        //list
        List<String> list = new ArrayList<>();
        
        list.add("First element");
        list.add("Second element");
        list.add("First element");        //duplicate entry
        list.add("Third element");
        
        System.out.println("Printing list:");
        System.out.println(list);     //duplicates will be printed and insertion order will be maintained
        
        System.out.println("");
        
        
        //set
        Set<String> set = new HashSet<>();
        
        set.add("First element");
        set.add("Second element");
        set.add("First element");        //duplicate entry
        set.add("Third element");
        
        System.out.println("Printing Set elements:");
        System.out.println(set);        //duplicate entry will not be printed, no specific order
        
    }
    
}
