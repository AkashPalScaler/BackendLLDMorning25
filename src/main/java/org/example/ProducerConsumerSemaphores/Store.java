package org.example.ProducerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    public int getMaxSize(){
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems(){
        return items;
    }

    public Store(int size){
        maxSize = size;
        items = new ConcurrentLinkedDeque<>();
    }

    public void addItem(){
        System.out.println("Producer is producing, current size : "+ items.size());
        items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer is consuming, current size : "+ items.size());
        items.remove(); // Smart to remove last available item
        //items.removeLast() in non concurrent data structure ->  all 3 threads was trying to remove last item
    }
}