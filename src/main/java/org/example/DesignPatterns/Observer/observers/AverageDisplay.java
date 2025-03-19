package org.example.DesignPatterns.Observer.observers;

import org.example.DesignPatterns.Observer.Observer;

public class AverageDisplay implements Observer {
    float avgTemp;
    float avgPrecipipation;
    float avgAqi;
    @Override
    public void notify(Integer temperature, Float precipitation, Integer aqi) {
        //Do what you want to do with data and display

        avgTemp += temperature;
        avgTemp /= 2;
        avgPrecipipation += precipitation;
        avgPrecipipation /= 2;
        avgAqi += aqi;
        avgAqi /= 2;

        display();
    }

    void display(){
        System.out.println("Average display got new data");
        System.out.println("Average Temperature : " + avgTemp + "\n Average Precipitation : " + avgPrecipipation + "\n Avergae AQI : " + avgAqi);
    }
}
