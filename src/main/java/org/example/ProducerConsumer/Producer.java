package org.example.ProducerConsumer;

public class Producer implements Runnable{
    Store store;
    public Producer(Store store){
        this.store = store;
    }


    public void run(){
        while(true){
            synchronized (store){
                //if(currentSize < MaxSize)
                if(store.getItems().size() < store.getMaxSize()){
                    store.addItem();
                }
            }
        }
    }
}