package org.example.AddedSubtractorSynchronizedMethod;

public class Value {
    int x;

    synchronized void increment(int i){ //this.internalLock.lock()

        x += i;
    }//this.internalLock.unlock()

    synchronized  void decrement(int i)
    {
        x -= i;
    }
}
