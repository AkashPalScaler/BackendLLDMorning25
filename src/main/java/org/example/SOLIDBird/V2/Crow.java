package org.example.SOLIDBird.V2;

public class Crow extends FlyingBird {
    @Override
    void fly() {
        System.out.println(name + "is high flying");
    }

    @Override
    void makeSound() {
        System.out.println("Crow making sound");
    }
}
