package org.example.SOLIDBird.V3;

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
