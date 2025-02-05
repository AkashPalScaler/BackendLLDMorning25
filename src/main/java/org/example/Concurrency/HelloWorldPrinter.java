package org.example.Concurrency;

import static java.lang.Thread.sleep;

public class HelloWorldPrinter implements Runnable {
    int x;


    public void check(){
        System.out.println("Check function :" + Thread.currentThread().getName());
    }


    public void run() { //Starting point of the new thread
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World : " + Thread.currentThread().getName());
        check();
        //thread stops
    }
}
