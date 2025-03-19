package org.example.DesignPatterns.Observer;

public interface Observer {
    void notify(Integer temperature, Float precipitation, Integer aqi);
}
