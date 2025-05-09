package org.example.AdderSubtracterMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        v.x = 0;

        Lock lock = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Adder a = new Adder(v, lock, lock2);
        Subtractor s = new Subtractor(v, lock, lock2);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(a);
        Future<Void> subFuture = es.submit(s);

        addFuture.get();
        subFuture.get();

        System.out.println("Value of x: "+v.x);
    }
}
