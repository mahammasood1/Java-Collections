
package navigableset_navigablemap;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableSet_NavigableMap {

   
    public static void main(String[] args) {
        
        //navigableset
        NavigableSet<Integer> ns = new TreeSet<>();
        
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        
        System.out.println("Navigable Set:");
        
        System.out.println("Normal Order: " + ns);
        System.out.println("Reverse Order: " + ns.descendingSet());
        
        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));
        
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set: " + ns);
        
        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set: " + ns);
        
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set: " + ns);
        
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("pollLast(): " + ns.pollLast());
        
        System.out.println("");
        
        
        
        //navigablemap
        NavigableMap<String, Integer> nm = new TreeMap<String,Integer>();
        
        nm.put("Z", 4);
        nm.put("C", 0);
        nm.put("A", 2);
        nm.put("Y", 15);
        
        System.out.println("NavigableMap:");
        
        System.out.println("Normal Order: " + nm);
        System.out.println("Descending Set: " + nm.descendingKeySet());
        System.out.println("Floor Entry: " + nm.floorEntry("C"));
        System.out.println("First Entry: " + nm.firstEntry());
        System.out.println("Last Key: " + nm.lastKey());
        System.out.println("First Key: " + nm.firstKey());
        System.out.println("Reverse Map: " + nm.descendingMap());
        
        
        
    }
    
}
