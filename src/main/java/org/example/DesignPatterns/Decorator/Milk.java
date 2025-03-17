package org.example.DesignPatterns.Decorator;

public class Milk implements AddOns{
    public Beverage baseBeverage;
    private final int cost = 30;
    public Milk(Beverage b){
        this.baseBeverage = b;
    }
    @Override
    public int getCost() {
        return cost + baseBeverage.getCost();
    }

    @Override
    public void getDescription() {
        baseBeverage.getDescription();
        System.out.print(" + Milk");
    }
    @Override
    public Beverage removeLastAddOn(){
        return baseBeverage;
    }

}
