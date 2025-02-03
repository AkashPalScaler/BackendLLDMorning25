package org.example.Concurrency;

public class HelloWorldPrinter implements Runnable {
    int x;


    public void check(){
        System.out.println("Check function :" + Thread.currentThread().getName());
    }


    public void run() { //Starting point of the new thread
        System.out.println("Hello World : " + Thread.currentThread().getName());
        check();
        //thread stops
    }
}
