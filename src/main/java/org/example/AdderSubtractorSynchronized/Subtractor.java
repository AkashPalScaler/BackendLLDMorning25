package org.example.AdderSubtractorSynchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock;

    public Subtractor(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000;i++){
            synchronized (v){
                System.out.println("Subtracting :" + i);
                v.x -= i;
            }

        }
        return null;
    }
}
