package org.example.SOLIDBird.V4;


public class Client {
    public static void main(String[] args){

//            Bird b1 = new Pigeon();
//            Bird b2 = new Crow();
//
//            b1.eat();
//            b2.makeSound();
//
//            Bird b3 = new Penguin();
//            b3.eat(); // Do nothing
//
//            Penguin p1 = new Penguin();
//            p1.swim();
//
//            Pigeon p = new Pigeon();
//            p.name = "Piggy";
//            p.fly();
//
//            IFlyable fbird = new Pigeon();
//
//            fbird.fly();

            Pigeon p = new Pigeon(new HighFlying());
            Pigeon p1 = new Pigeon(new NewHighFlying());
            Crow c = new Crow(new LowFlying());

    }
}
