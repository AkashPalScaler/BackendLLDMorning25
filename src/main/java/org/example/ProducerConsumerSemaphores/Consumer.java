package org.example.ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;
    public Consumer(Store store, Semaphore prodSema, Semaphore consSema){

        this.store = store;
        this.consSema = consSema;
        this.prodSema = prodSema;
    }
    public void run(){
        while(true){
                //if(currentSize > 0) -> item available or not?
            try {
                consSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();

        }
    }
}