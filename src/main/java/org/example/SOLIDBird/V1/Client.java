package org.example.SOLIDBird.V1;

public class Client {
    public static void main(String[] args) throws Exception {

            Bird b1 = new Pigeon();
            Bird b2 = new Crow();

            b1.fly();
            b2.fly();

            Bird b3 = new Penguin();
            b3.fly(); // Do nothing/Throw Exception
    }
}
