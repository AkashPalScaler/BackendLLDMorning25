package org.example.ProducerConsumer;

public class Consumer implements Runnable{
    Store store;
    public Consumer(Store store){
        this.store = store;
    }
    public void run(){
        while(true){
                //if(currentSize > 0) -> item available or not?
            synchronized (store){
                if(store.getItems().size() > 0){
                    store.removeItem();
                }
            }

        }
    }
}