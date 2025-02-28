package org.example.SOLIDBird.V3;

public class Client {
    public static void main(String[] args){

            Bird b1 = new Pigeon();
            Bird b2 = new Crow();

            b1.eat();
            b2.makeSound();

            Bird b3 = new Penguin();
            b3.eat(); // Do nothing

            Penguin p1 = new Penguin();
            p1.swim();
    }
}
