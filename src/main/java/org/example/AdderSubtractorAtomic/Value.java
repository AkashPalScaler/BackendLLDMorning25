package org.example.AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Value {
    AtomicInteger x;

    public Value(){
        x = new AtomicInteger();
    }
}
