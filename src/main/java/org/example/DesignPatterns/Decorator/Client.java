package org.example.DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new HouseBlend();
        b = new Milk(b);
        b = new Cream(b);
        b = new Cream(b);
        b = b.removeLastAddOn();

        b.getDescription();
        System.out.println();
        System.out.println("Total cost : " + b.getCost());
    }
}
