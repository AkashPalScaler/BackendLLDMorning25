package org.example.DesignPatterns.Observer.observers;

import org.example.DesignPatterns.Observer.Observer;

public class ForecastDisplay implements Observer {
    @Override
    public void notify(Integer temperature, Float precipitation, Integer aqi) {
        display();
    }
    void display(){
        System.out.println("Forecast display got new data");
    }
}
