package org.example.AdderSubtracterMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock;
    Lock lock2;
    public Adder(Value v, Lock lock, Lock lock2){

        this.v = v;
        this.lock = lock;
        this.lock2 = lock2;
    }

    @Override
    public Void call() throws Exception {

        for(int i=1;i<=1000;i++){

            lock2.lock();
            lock.lock();
            System.out.println("Adding :" + i);
            v.x += i;
            lock.unlock();
            lock2.unlock();
        }
        return null;
    }
}
