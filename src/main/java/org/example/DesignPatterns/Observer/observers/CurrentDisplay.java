package org.example.DesignPatterns.Observer.observers;

import org.example.DesignPatterns.Observer.Observer;

public class CurrentDisplay implements Observer {
    @Override
    public void notify(Integer temperature, Float precipitation, Integer aqi) {
        display();
    }

    void display(){
        System.out.println("Current display got new data");
    }
}
