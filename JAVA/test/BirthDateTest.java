package collection.test;

import java.util.*;

public class BirthDateTest {

    public static void main(String[] args) {
//        Set<BirthDate> set = new HashSet<BirthDate>();  // new TreeSet<BirthDate>();
    	Set<BirthDate> set = new TreeSet<>();
        BirthDate myBirth = new BirthDate(1993, 5, 16);
        BirthDate yourBirth = new BirthDate(2000, 1, 1);
        BirthDate hisBirth = new BirthDate(1999, 12, 31);
        BirthDate herBirth = new BirthDate(1993, 5, 16);

        System.out.println( set.add(myBirth) );
        System.out.println( set.add(yourBirth) );
        System.out.println( set.add(herBirth) );
        System.out.println( set.add(hisBirth) );

        System.out.println(set);
    }
}
