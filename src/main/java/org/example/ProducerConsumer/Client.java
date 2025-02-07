package org.example.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        ExecutorService es = Executors.newFixedThreadPool(10);
        //ON 8 threads 8 producers are working
        for(int i=0;i<10;i++){
            es.execute(producer);
        }
        //On 20 threads 20 consumers are working
        for(int i=0;i<30;i++){
            es.execute(consumer);
        }
    }
}