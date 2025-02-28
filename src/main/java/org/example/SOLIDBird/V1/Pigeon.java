package org.example.SOLIDBird.V1;

public class Pigeon extends Bird{
    @Override
    void makeSound() {
        System.out.println("Pigeon making sound");
    }

    @Override
    void fly() {
        System.out.println(name + "is low flying");
    }
}
