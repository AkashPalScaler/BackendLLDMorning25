package org.example.DesignPatterns.Decorator;

public class Cream implements AddOns{
    public Beverage baseBeverage;
    private final int cost = 50;
    public Cream(Beverage b){
        this.baseBeverage = b;
    }
    @Override
    public int getCost() {
        return cost + baseBeverage.getCost();
    }

    @Override
    public void getDescription() {
        baseBeverage.getDescription();
        System.out.print(" + Cream");
    }

    public Beverage removeLastAddOn(){
        return baseBeverage;
    }
}
