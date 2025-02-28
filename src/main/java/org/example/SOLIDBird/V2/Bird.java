package org.example.SOLIDBird.V2;

public abstract class Bird {
    String name;
    Float weight;
    String color;
    String type;

    void eat(){
        System.out.println(name + " is eating");
    }
    abstract void makeSound();

}
