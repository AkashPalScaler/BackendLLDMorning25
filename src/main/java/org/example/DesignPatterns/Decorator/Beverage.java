package org.example.DesignPatterns.Decorator;

//This can be an abstract class as it is an entity
public interface Beverage {
    int getCost();
    void getDescription();
    Beverage removeLastAddOn();
}
