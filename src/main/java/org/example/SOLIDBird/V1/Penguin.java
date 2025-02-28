package org.example.SOLIDBird.V1;

public class Penguin extends Bird{
    @Override
    void fly() throws Exception {
        throw new Exception("Penguin doesn't fly");
    }

    @Override
    void makeSound() {

    }
}
