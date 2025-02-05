package org.example.Concurrency;

import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter(); // Also a runnable type
//        System.out.println("Main : " + Thread.currentThread().getName());
//        helloWorldPrinter.run();
//
//        Thread t = new Thread(helloWorldPrinter); //Creation of One thread
//        t.start(); // It will call helloWorldPrinter.run() on the created thread;
//        System.out.println("Thread should be over?");
//        for(int i=1;i<=1000000;i++){
//            NumberPrinter np  =  new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();
//        }

        //Executors
//        Executor executor = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=10000;i++){
//            if(i == 8000){
//                System.out.println("STOP DEBUG");
//            }
//            NumberPrinter np  =  new NumberPrinter(i);
//            executor.execute(np);
//        }
//        System.out.println("Printing over!");

        //Synchronisation problem

        Value v = new Value();
        v.x = 0;

        Adder a = new Adder(v);
        Subtractor s = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(a);
        Future<Void> subFuture = es.submit(s);

        addFuture.get();
        subFuture.get();

        System.out.println("Value of x: "+v.x);


    }
}
