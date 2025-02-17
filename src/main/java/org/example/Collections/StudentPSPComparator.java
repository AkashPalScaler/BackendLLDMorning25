package org.example.Collections;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 1st o1 and 2nd o2
        // o1 to come first ->  -ve
        // o2 to come first -> +ve
        // return 0

        // Ascending order
        if(o1.psp > o2.psp){
            return 10; //+ve
        }else if(o1.psp < o2.psp){
            return -20; // -ve
        }

        return 0;
    }
}
