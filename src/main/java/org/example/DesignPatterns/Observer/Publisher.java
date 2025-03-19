package org.example.DesignPatterns.Observer;

public interface Publisher {
    void registerObserver(Observer o);
    void deRegisterObserver(Observer o);
    void notifyObservers();
}
