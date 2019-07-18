package collection;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List list = new ArrayList();

        System.out.println( list.add("one") );
        System.out.println( list.add("second") );
        System.out.println( list.add("3rd") );
        System.out.println( list.add(new Integer(4)) );
        System.out.println( list.add(new Float(5.0F)) );
        System.out.println( list.add("second") );
        System.out.println( list.add(new Integer(4)) );

        System.out.println(list);
        System.out.println("========================");
        ListIterator it = list.listIterator(); //listIterator
        Object item;
        while(it.hasNext()) {
        	item = it.next();
        	System.out.println(item);
		}
 
        
	}
}
