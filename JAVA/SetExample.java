package collection;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set set = new HashSet();

        System.out.println( set.add("one") );
        System.out.println( set.add("second") );
        System.out.println( set.add("3rd") );
        System.out.println( set.add(new Integer(4)) );
        System.out.println( set.add(new Float(5.0F)) );
        System.out.println( set.add("second") );
        System.out.println( set.add(new Integer(4)) );

        System.out.println(set);
        
        Iterator it = set.iterator();
        Object item;
        while(it.hasNext()) {
        	item = it.next();
        	System.out.println(item);
        }
        
        System.out.println("=====================");
        for(Object o:set) {
        	System.out.println(o);
        }
    }
}
