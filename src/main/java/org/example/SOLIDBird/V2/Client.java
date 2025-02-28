package org.example.SOLIDBird.V2;

public class Client {
    public static void main(String[] args) throws Exception {

            Bird b1 = new Pigeon();
            Bird b2 = new Crow();

            Bird b3 = new Penguin();


            FlyingBird bf1 = new Pigeon();
            bf1.fly();


    }
}
