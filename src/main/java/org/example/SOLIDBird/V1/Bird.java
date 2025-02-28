package org.example.SOLIDBird.V1;

public abstract class Bird {
    String name;
    Float weight;
    String color;
    String type;

    abstract void fly() throws Exception;
    void eat(){
        System.out.println(name + " is eating");
    }
    abstract void makeSound();

}
