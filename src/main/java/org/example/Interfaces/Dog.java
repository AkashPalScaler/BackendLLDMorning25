package org.example.Interfaces;

public class Dog extends Animal implements Runner {
    void bark(){
        System.out.println("Dog barks");
    }

    //implemented from runner
    public void run(){
        System.out.println("Dog runs");
    }

    public void run(int x){
        System.out.println("Overloaded run");
    }

    static void check(){
        System.out.println("Dog check");
    }
}
