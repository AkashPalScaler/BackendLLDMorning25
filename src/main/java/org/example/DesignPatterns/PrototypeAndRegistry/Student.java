package org.example.DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    public Student copy(){
        System.out.println("Student copy called");
        return new Student(this);
    }
}
