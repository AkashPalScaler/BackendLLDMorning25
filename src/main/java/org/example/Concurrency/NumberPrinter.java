package org.example.Concurrency;

public class NumberPrinter implements Runnable {
    int numberToPrint;
    public NumberPrinter(int i){
        numberToPrint = i;
    }

    public void run(){
        System.out.println(numberToPrint + " -> " + Thread.currentThread().getName());
    }
}
