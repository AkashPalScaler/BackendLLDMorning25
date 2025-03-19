package org.example.DesignPatterns.Observer;

import org.example.DesignPatterns.Observer.observers.AverageDisplay;
import org.example.DesignPatterns.Observer.observers.CurrentDisplay;
import org.example.DesignPatterns.Observer.observers.ForecastDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(0, 0.0f, 0);

        Observer avgDisplay = new AverageDisplay();
        Observer currDisplay = new CurrentDisplay();
        Observer foreCastDisplay = new ForecastDisplay();

        weatherStation.setWeatherData(2, 5.0f, 6);

        weatherStation.registerObserver(avgDisplay);
        weatherStation.registerObserver(currDisplay);

        weatherStation.setWeatherData(3, 10.0f, 100);

        weatherStation.registerObserver(foreCastDisplay);

        weatherStation.setWeatherData(100, 13.0f, 90);

        weatherStation.deRegisterObserver(currDisplay);

        weatherStation.setWeatherData(2, 5.0f, 6);
    }
}
