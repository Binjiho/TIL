package collection.comparable;

import java.util.*;

public class ComparableTest {

    public static void main(String[] args) {
        TreeSet<Student> studentSet = new TreeSet<Student>();
        studentSet.add( new Student("Mike", "Hauffmann", 101, 4.0) );
        studentSet.add( new Student("John", "Lynn", 102, 2.8) );
        studentSet.add( new Student("Jim", "Max", 103, 3.6) );
        studentSet.add( new Student("Kelly", "Grant", 104, 2.3) );

        for (Student s : studentSet) {
            System.out.println(s);
        }
    }
}
