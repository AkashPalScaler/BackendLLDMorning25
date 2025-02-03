package org.example.Concurrency;

public class Client {

    public static void main(String[] args) {
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter(); // Also a runnable type
//        System.out.println("Main : " + Thread.currentThread().getName());
//        helloWorldPrinter.run();
//
//        Thread t = new Thread(helloWorldPrinter); //Creation of One thread
//        t.start(); // It will call helloWorldPrinter.run() on the created thread;

        for(int i=1;i<=100;i++){
            NumberPrinter np  =  new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }

    }
}
