package collection.comparator;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {
//      Comparator c = new NameComp();
        Comparator<Student> c = new GradeComp();
        TreeSet<Student> studentSet = new TreeSet<Student>(c);
//      TreeSet studentSet = new TreeSet(c);
        studentSet.add( new Student("Mike", "Hauffmann", 101, 4.0) );
        studentSet.add( new Student("John", "Lynn", 102, 2.8) );
        studentSet.add( new Student("Jim", "Max", 103, 3.6) );
        studentSet.add( new Student("Kelly", "Grant", 104, 2.3) );
        
        /*
        Student s;
        for (Object obj : studentSet) {
            s = (Student) obj;
            System.out.println(s);
        }
        */
        
        for (Student st : studentSet) {
        	System.out.println(st);
        }
    }
}
