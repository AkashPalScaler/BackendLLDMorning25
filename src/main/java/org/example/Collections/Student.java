package org.example.Collections;

public class Student implements Comparable<Student>{
    String name;
    int age;
    float psp;
    int gradYear;

    public Student(String name, int age, float psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student o) {
        // 1st this and 2nd o
        // this to come first ->  -ve
        // o to come first -> +ve
        // return 0

        // Ascending order
        if(this.age > o.age){
            return 10;
        }else if(this.age < o.age){
            return -20;
        }

        return 0;
    }
}
