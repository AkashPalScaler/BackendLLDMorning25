package org.example.SOLIDBird.V0;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.type = "Pigeon";
        b1.name = "Piggy";

        Bird b2 = new Bird();
        b2.type = "Crow";
        b2.name = "Cry";

        b1.fly();
        b2.fly();
    }
}
