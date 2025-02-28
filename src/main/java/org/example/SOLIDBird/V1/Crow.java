package org.example.SOLIDBird.V1;

public class Crow extends Bird{
    @Override
    void fly() {
        System.out.println(name + "is high flying");
    }

    @Override
    void makeSound() {
        System.out.println("Crow making sound");
    }
}
