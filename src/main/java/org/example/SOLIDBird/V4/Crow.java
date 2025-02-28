package org.example.SOLIDBird.V4;

public class Crow extends Bird implements IFlyable {
    IFlyingStrategy hf;
    IMakeSoundStrategy ms = new ScreechSound();
    Crow(IFlyingStrategy hf){
        this.hf = hf;
    }
    @Override
    public void fly() {
        hf.fly(name);
    }

    @Override
    void makeSound() {
        //screech
//        System.out.println("Crow making sound");
        ms.makeSound();
    }
}

// n features -> 2^n classes
// n features -> n interface