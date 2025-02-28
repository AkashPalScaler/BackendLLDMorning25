package org.example.SOLIDBird.V4;

public class LowFlying implements IFlyingStrategy {
    public void fly(String name){
        System.out.println(name + " is low flying");
    }
}
