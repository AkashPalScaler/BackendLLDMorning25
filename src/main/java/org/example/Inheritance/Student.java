package org.example.Inheritance;

public class Student extends User {
    //You can see and access the User properties here - except for private (private can only be seen)
    //Attribute
    String batch;
    protected int gradYear;

    public Student(){
        // In the very first line is hidden the parent constructor call
        super("Akash"); // Calling the parent constructor
        System.out.println("Student constructor called!");
    }

    public Student(String batch){

        this();
        this.batch = batch;
        System.out.println("Student param constructor called!");
    }

//    public void doSomething(){
////        this.i = 10;
//        this.gradYear =190;
//    }

}
