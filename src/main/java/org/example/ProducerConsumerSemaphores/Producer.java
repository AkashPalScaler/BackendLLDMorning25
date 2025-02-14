package org.example.ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;
    public Producer(Store store, Semaphore prodSema, Semaphore consSema){

        this.store = store;
        this.consSema = consSema;
        this.prodSema = prodSema;
    }


    public void run(){
        while(true){
                //if(currentSize < MaxSize)
            try {
                //Thread comes here -> it needs all 5 permits to go inside
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSema.release();
        }
    }
}