package collection.comparator;

import java.util.*;

public class NameComp implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.getFirstName().compareTo(s2.getFirstName())); //String �� compareTo �޼���
    }
}
