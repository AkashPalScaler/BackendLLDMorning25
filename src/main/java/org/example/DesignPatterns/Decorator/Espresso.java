package org.example.DesignPatterns.Decorator;

public class Espresso implements Beverage{
    private final int cost = 100;
    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void getDescription() {
        System.out.print("Our strongest coffee");
    }

    @Override
    public Beverage removeLastAddOn() {
        return null;
    }
}
