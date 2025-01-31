package org.example.IntroToOOPs;

public class Student {
    //Attribute
    public String name;
    int id; //Default
    private int age;
    protected int gradYear;
    static int countOfStudent;

    //Static block
    static {
        countOfStudent = 10;//apicall();
        //some logic to initialise static vars
        // This block gets run only once when class is loaded
    }


    //Behaviours/functions\
    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age > 18) {
            this.age = age;
        }else{
            System.out.println("invalid age");
        }
    }

    public void rateClass(int rating){
        System.out.println("You have rated the class "+ rating);
    }

    public void solveAssignment(int assignmentId){
        System.out.println("You are now solving assignment " + assignmentId);
    }
}
