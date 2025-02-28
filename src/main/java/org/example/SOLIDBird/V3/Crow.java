package org.example.SOLIDBird.V3;

public class Crow extends Bird implements IFlyable{
    @Override
    public void fly() {
        System.out.println(name + "is high flying");
    }

    @Override
    void makeSound() {
        System.out.println("Crow making sound");
    }
}

// n features -> 2^n classes
// n features -> n interface