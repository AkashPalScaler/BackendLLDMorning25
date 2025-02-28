package org.example.SOLIDBird.V4;

public class Pigeon extends Bird implements IFlyable {
    IFlyingStrategy lf;
    Pigeon(IFlyingStrategy lf){
        this.lf = lf;
    }
    @Override
    void makeSound() {
        //sing
        System.out.println("Pigeon making sound");
    }

    @Override
    public void fly() {
        lf.fly(name);
    }
}
