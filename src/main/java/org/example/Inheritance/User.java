package org.example.Inheritance;

public class User {
    private int id;
    public String name;
    protected int age;

    public User(){
        System.out.println("User constructor called!");
    }

    public User(String name){
        System.out.println("User param constructor called!");
        this.name = name;
    }
}
