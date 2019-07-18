package collection.comparator;

import java.util.*;

public class GradeComp implements Comparator<Student> { 
    public int compare(Student s1, Student s2) {
        if (((Student) s1).getGPA() == ((Student) s2).getGPA())
            return 0;
        else if (((Student) s1).getGPA() < ((Student) s2).getGPA())
            return -1;
        else
            return 1;
    }
}
