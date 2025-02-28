package org.example.SOLIDBird.V4;

public class ScreechSound implements IMakeSoundStrategy{
    @Override
    public void makeSound() {
        System.out.println("Screeching");
    }
}
