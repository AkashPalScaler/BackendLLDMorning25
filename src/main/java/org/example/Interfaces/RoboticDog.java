package org.example.Interfaces;

public class RoboticDog implements Runner{
    void charge(){
        System.out.println("Getting charged");
    }

    //implemented from runner
    public void run(){
        System.out.println("Dog runs");
    }
}

