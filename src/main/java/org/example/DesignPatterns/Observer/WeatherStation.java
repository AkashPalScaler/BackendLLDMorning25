package org.example.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher {
    Integer temperature;
    Float precipitation;
    Integer aqi;
    List<Observer> observers;

    public WeatherStation(Integer temperature, Float precipitation, Integer aqi) {
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.aqi = aqi;
        this.observers = new ArrayList<>();
    }

    void setWeatherData(Integer temperature, Float precipitation, Integer aqi){
        System.out.println();
        System.out.println("**** Weather Data Updated ****");
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.aqi = aqi;

        //Notify
        afterDataGetsUpdated();
    }

    void afterDataGetsUpdated(){
        // Some pre-calculations needed on weather data
        //notify
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deRegisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.notify(this.temperature, this.precipitation, this.aqi);
        }
    }
}
