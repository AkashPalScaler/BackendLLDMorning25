package org.example.ProducerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore prodSema = new Semaphore(10);
        Semaphore consSema = new Semaphore(0);

        Producer producer = new Producer(store, prodSema, consSema);
        Consumer consumer = new Consumer(store, prodSema, consSema);

        ExecutorService es = Executors.newCachedThreadPool();
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