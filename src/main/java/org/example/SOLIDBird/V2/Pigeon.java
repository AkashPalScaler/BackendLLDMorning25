package org.example.SOLIDBird.V2;

public class Pigeon extends FlyingBird {
    @Override
    void makeSound() {
        System.out.println("Pigeon making sound");
    }

    @Override
    void fly() {
        System.out.println(name + "is low flying");
    }
}
