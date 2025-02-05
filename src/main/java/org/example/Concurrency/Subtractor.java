package org.example.Concurrency;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;

    public Subtractor(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000;i++){
            v.x -= i;
        }
        return null;
    }
}
