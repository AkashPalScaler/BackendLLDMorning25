package org.example.DesignPatterns.Decorator;

public class HouseBlend implements Beverage{
    private final int cost = 150;
    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void getDescription() {
        System.out.print("Our in house brewed coffee");
    }

    @Override
    public Beverage removeLastAddOn() {
        return null;
    }
}
