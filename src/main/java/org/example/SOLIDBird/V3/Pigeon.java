package org.example.SOLIDBird.V3;

public class Pigeon extends Bird implements IFlyable{
    @Override
    void makeSound() {
        System.out.println("Pigeon making sound");
    }

    @Override
    public void fly() {
        System.out.println(name + "is low flying");
    }
}
